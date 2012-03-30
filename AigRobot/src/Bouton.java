import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Bouton {

	public Method actionAppui;
	public Object target;
		
	public Bouton ( Object target, Method action) {
		
		this.target = target;
		this.actionAppui = action;

	}
	
	public void appui() {
		
		try {
			this.actionAppui.invoke(this.target);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
