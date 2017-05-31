package marvin.app;

import com.marvin.component.kernel.Kernel;

import com.marvin.bundle.debug.DebugBundle;
import com.marvin.bundle.framework.FrameworkBundle;
import com.marvin.bundle.web.WebBundle;
import com.marvin.component.kernel.bundle.Bundle;

public class AppKernel extends Kernel {

    public AppKernel(String environment, boolean debug) {
        super(environment, debug);
    }
    
    @Override
    protected Bundle[] registerBundles() {
        return new Bundle[]{
            
            // add framework bundle.
            new FrameworkBundle(),
            new DebugBundle(),
            
            new WebBundle(),
        };
    }
}
