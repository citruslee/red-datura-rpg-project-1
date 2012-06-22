package Main;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.light.SpotLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Spatial;
import com.jme3.shadow.BasicShadowRenderer;



/**
 * RPG game
 * @author Red Datura Team
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
flyCam.setMoveSpeed(15f);
        /** Load a model. Uses model and texture from jme3-test-data library! */ 
        Spatial teapot = assetManager.loadModel("Models/vikingvisko1.j3o");
       // Material mat_default = new Material( assetManager, "Common/MatDefs/Misc/ShowNormals.j3md");
       
        rootNode.attachChild(teapot);
          /** Basic shadow for even surfaces */ 
 BasicShadowRenderer bsr = new BasicShadowRenderer(assetManager, 256);
 bsr.setDirection(new Vector3f(-.5f,-.5f,-.5f).normalizeLocal());
 viewPort.addProcessor(bsr); 
 
          
   
   
            /** A white, directional light source */ 
    DirectionalLight sun = new DirectionalLight();
    sun.setDirection((new Vector3f(-0.5f, -0.5f, -0.5f)).normalizeLocal());
    sun.setColor(ColorRGBA.White);
    rootNode.addLight(sun); 
        
    cam.setFrustumFar(5000);
       cam.onFrameChange();
      
    }

    @Override
    public void simpleUpdate(float tpf) {
        
    }

    @Override
    public void simpleRender(RenderManager rm) {
    
    }
}
