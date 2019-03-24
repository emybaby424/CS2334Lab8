public enum Shape{
	THIMBLE,
	BOOT, 
	RACECAR;
	
	public class Grab{
		Shape shape;
	
	public Grab(Shape shape) {
		this.shape = shape;
	}
	public String howBoutDis() {
		String result = "";
		switch(shape) {
		case THIMBLE:
result = "thimble";
break;
		
		case BOOT:
			result = "boot";
			break;
			
		case RACECAR:
			result = "racecar";
			break;
		}
		return result;
}
	@Override
	public String toString() {
		String result = "";
		
		if(shape==THIMBLE) {
		Grab newo = new Grab(Shape.THIMBLE);
		result = newo.howBoutDis();
	
	}
		if(shape==BOOT) {
			Grab newo = new Grab(Shape.BOOT);
			result = newo.howBoutDis();
		
		}
		if(shape==RACECAR) {
			Grab newo = new Grab(Shape.RACECAR);
			result = newo.howBoutDis();
		
		}
		return result;
	}


}
