package demo;

import com.marvin.bundle.web.DispatcherServlet;
import com.marvin.bundle.web.WebApplicationInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import marvin.demo.app.AppKernel;

public class DemoWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        AppKernel kernel = new AppKernel(true);
        ServletRegistration.Dynamic dispatcher = 
                sc.addServlet("dispatcher", new DispatcherServlet(kernel));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");
    }
    
}
