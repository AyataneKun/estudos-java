package one.digitalinnovation.springmvcrestjaxrs.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class FilterJava implements Filter {
    private Logger logger = LoggerFactory.getLogger(FilterJava.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("Entrada");
        HttpServletRequest request1 = (HttpServletRequest) request;
        Enumeration<String> headerNames = request1.getHeaderNames();
        Map<String,String> mapHeaders = Collections.list(headerNames).stream()
                .collect(Collectors.toMap(it -> it, request1::getHeader));

        if(mapHeaders.get("authorization") != null && mapHeaders.get("authorization").equals("BATATINHA")){
            chain.doFilter(request,response);
        }else {
            HttpServletResponse response1 = (HttpServletResponse) response;
            response1.sendError(403);
        }

        logger.info("Saída");
    }
}
