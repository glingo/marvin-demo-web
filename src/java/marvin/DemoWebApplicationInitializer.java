package marvin;

import com.marvin.bundle.web.FrameworkServlet;
import com.marvin.bundle.web.WebApplicationInitializer;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import marvin.demo.app.Application;

public class DemoWebApplicationInitializer implements WebApplicationInitializer {
    
    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        Servlet servlet  = new FrameworkServlet(new Application("dev", true));
        
        ServletRegistration.Dynamic registration = sc.addServlet("dispatcher", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
