package marvin.app;

import com.marvin.component.kernel.Kernel;
import com.marvin.component.kernel.bundle.Bundle;

import com.marvin.bundle.debug.DebugBundle;
import com.marvin.bundle.framework.FrameworkBundle;
import com.marvin.bundle.web.WebBundle;
import marvin.demo.DemoBundle;

import marvin.nn.NeuralNetworkBundle;
import marvin.test.TestBundle;

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
            
            new DemoBundle(),
            new TestBundle(),
            new NeuralNetworkBundle(),
        };
    }
}
