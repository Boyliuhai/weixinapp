package com.cug.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class RequestWrapper extends HttpServletRequestWrapper {
	
    private final String body;
    
    public RequestWrapper(HttpServletRequest request) throws IOException {
    
        super(request);
        
        StringBuilder stringBuilder = new StringBuilder();
        
        BufferedReader bufferedReader = null;
        
        try {
        	
            InputStream inputStream = request.getInputStream();
            
            if (inputStream != null) {
            	
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append("");
            }
        } catch (IOException ex) {
            throw ex;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    throw ex;
                }
            }
        }
        body = stringBuilder.toString();
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
    	
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(body.getBytes());
        
        ServletInputStream servletInputStream = new ServletInputStream() {
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return byteArrayInputStream.read();
			}
			
			@Override
			public void setReadListener(ReadListener readListener) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isReady() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isFinished() {
				// TODO Auto-generated method stub
				return false;
			}
		};
        return servletInputStream;

    }
    
    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(this.getInputStream()));
    }
    public String getBody() {
        return this.body;
    }

}
