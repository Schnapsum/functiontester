package objects;

import java.util.Iterator;
import java.util.Vector;

@SuppressWarnings("rawtypes")
public class DrawManager implements Iterator{
	private Vector<Draw> draws;
	
	
	public DrawManager() {
		
	}
	
	
	public void setDraws(Vector<Draw> draws){
		this.draws = draws;
	}
	
	
	public Draw getDraw(int index){
		return this.draws.elementAt(index);
	}
	
	
	public Vector<Draw> getDraws(){
		Vector<Draw> v = new Vector<Draw>();
		for(Iterator<Draw> i = draws.iterator(); i.hasNext();){
			v.add(i.next());
		}
		return v;
	}
	
	
	@Override
	public boolean hasNext() {
		draws.iterator().hasNext();
		return false;
	}
	
	
	@Override
	public Object next() {
		return draws.iterator().next();
	}
	
	
	@Override
	public void remove() {
		draws.iterator().remove();
	}
}
