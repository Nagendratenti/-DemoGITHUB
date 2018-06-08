package Inheritancepgms;

public class Interfaceimpl implements Interfaceconcept,Interfacebody {

	public static void main(String[] args) {
		
		Interfaceimpl im=new Interfaceimpl();
		im.codeit();
		im.create();
		im.finish();
		im.xtrs();
		
		Interfaceconcept ic=new Interfaceimpl(); //polymorphism
		ic.create();
		ic.codeit();
		ic.finish();
		
		Interfacebody ib=new Interfaceimpl();
		ib.play();
		ib.pause();
		ib.stop();
	}

	@Override
	public void create() {
		
		System.out.println("creation");
	}

	@Override
	public void codeit() {
		
		System.out.println("update");
	}

	@Override
	public void finish() {
		System.out.println("this is where it ends");
		
	}
	public void xtrs()
	{
		System.out.println("XTRAS");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("PLAY");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop");
	}
}
