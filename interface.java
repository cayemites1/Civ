pifec.java  
public interface pifec{
	void draw();
}
//create  concrete class  implementing the  same  interface  
project.java
public  class  project  implements  pifec {
	@override  
	public  void  draw(){
		system.out.printIn("inside project: :draw()method.");  
	}
}
intégration.java
public  class intégration  implements  pifec{
	@override  
	public  void draw(){
		system.out.printIn("inside integration: :draw()method.");  
	}
}
facteurs.java
public class  facteurs implements pifec{
	@override  
	public void draw (){
		System.out.println("inside facteurs: :draw()method.");
	}
}
//create  a factory to  generate  object  of  concrete class  based on given information  
pifecFactory.java
public  class  pifecFactory{
	//use getPifec method to get  object of type Pifec
	public pifec getPifec(string  pifecType){
		if(pifec type ==null){
			return  null;
		}   
		if  (pifec type.equalsIgnoreCase("facteurs"){
			return  new facteurs();
			}else if(pifecType.equalsIgnoreCase("project") {
				return  new project();
				}else if(pifecType.equalsIgnoreCase("intégration") {
					return  new integration();  
				}  
				return  null; 
				}        
			}
			//use the  factory to get object of concrete class by passing an information such  as type . 
	factoryPatternDemo.java
	public  class  FactoryPatternDemo{
		public  static  void  main(string []args) {
			pifecFactory pifecFactory=new pifecFactory();
			//get an object of facteurs  and call its draw method.
			pifec pifec1=pifecFactory.getpifec("facteurs");
			//call  draw  method  of  facteurs  
			pifec1.draw();
			//get  an object  of  projets  and call its draw  method . 
			pifec pifec2=pifecFactory.getpifec("project") ;
			//call  draw  method  of  project  
			pifec2.draw();
			//get  an  object  of  intégration  and  call  its  draw  method  
			pifec pifec3=pifecFactory.getpifec("intégration") ;
			//call  draw  method  of  facteurs  
			pifec3.draw();  
		} 
	}       
		 
