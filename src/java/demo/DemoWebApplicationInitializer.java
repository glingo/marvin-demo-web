package demo;

import com.marvin.web.DispatcherServlet;
import com.marvin.web.WebApplicationInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import marvin.demo.app.AppKernel;

public class DemoWebApplicationInitializer implements WebApplicationInitializer {
//    private static final Logger LOG = Logger.getLogger(DemoWebApplicationInitializer.class.getName());

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        sc.log("onStartup !");
        AppKernel kernel = new AppKernel(true);
        ServletRegistration.Dynamic dispatcher = sc.addServlet("dispatcher", new DispatcherServlet(kernel));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");
        sc.log("Hello !");
    }
    
}
