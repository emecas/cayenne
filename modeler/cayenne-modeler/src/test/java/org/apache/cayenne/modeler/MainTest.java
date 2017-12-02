package org.apache.cayenne.modeler;

/**
 * A GUI testing implementation for Cayenne Modeler.
 *
 * @author Emerson Castaneda @EmeCas
 * @date 12/05/2017
 */


import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JListFixture;
import org.assertj.swing.fixture.JMenuItemFixture;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;


public class MainTest {
	
	
	private FrameFixture window;
	
	private Main target;

	@Before
	public void setUp() {
	  //SimpleCopyApplication frame = GuiActionRunner.execute(() -> new SimpleCopyApplication());
	  //
	  //window.show(); // shows the frame to test
	   target = new Main(new String[]{});	

	   
	   //Application app = target.injector.getInstance(Application.class);
	   
	   //window = new FrameFixture(app.getFrame());
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@Test
	public void testMain() {
		assertNotNull(target);
	}

	@Test
	public void testLaunch() {
		assertNotNull(target);
		target.launch();
		assertNotNull(target.injector);
		Application app = target.injector.getInstance(Application.class);
		assertNotNull(app);
		
		delay(3);
		
		CayenneModelerFrame cf = Application.getFrame();
		assertNotNull(cf);
		window = new FrameFixture(cf);
		assertNotNull(window);
		//window.panel("mainPanel").list("fileListPanel").clickItem(0);
		
		JListFixture wl =  window.list("recentProjectsList");
		assertNotNull(wl);
		if(wl.target().getModel().getSize() > 0){
 			wl.clickItem(0);
 			delay(3);
 		}
 		else{
			JMenuItemFixture newProjectMenuItemFixture = window.menuItem("newProjectMenuItem");
			newProjectMenuItemFixture.click();
 			delay(3);
 		}
		//new Main(args).launch()
		JMenuItemFixture newDataMapMenuItemFixture = window.menuItem("newDataMapMenuItem");
		JMenuItemFixture objEntityMenuItemFixture = window.menuItem("newObjEntityMenuItem");
		JMenuItemFixture dbEntityMenuItemFixture = window.menuItem("newDbEntityMenuItem");
		newDataMapMenuItemFixture.click();
		delay(1);
		objEntityMenuItemFixture.click();
		delay(1);
		objEntityMenuItemFixture.click();
		delay(1);
		objEntityMenuItemFixture.click();
		delay(1);
		dbEntityMenuItemFixture.click();
		delay(1);
		dbEntityMenuItemFixture.click();
		delay(1);
		dbEntityMenuItemFixture.click();
		delay(3);
	}

	private void delay(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testAppendModules() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void testInitialProjectFromPreferences() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testInitialProjectFromArgs() {
		fail("Not yet implemented");
	}

}
