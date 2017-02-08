package marvin;

import com.marvin.bundle.web.FrameworkServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import marvin.app.AppKernel;

public class DemoWebApplicationInitializer implements com.marvin.bundle.web.WebApplicationInitializer {
    
    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        Servlet servlet  = new FrameworkServlet(new AppKernel("dev", true));
        
        ServletRegistration.Dynamic registration = sc.addServlet("dispatcher", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
        
    }
}
