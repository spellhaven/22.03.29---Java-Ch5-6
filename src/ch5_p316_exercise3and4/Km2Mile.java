package ch5_p316_exercise3and4;

public class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		super();
		this.ratio = ratio; //외부에서 들어온 값으로 ratio 초기화
	}

	@Override
	protected double convert(double src) {
		double km_mile = src / ratio;
		return km_mile;
	}

	@Override
	protected String getSrcString() {
		String km = "km";
		return km;
	}

	@Override
	protected String getDestString() {
		String mile = "mile";
		return mile;
	}
	
	

}
