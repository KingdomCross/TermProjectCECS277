
public class Suite extends MotelRoom {
	private boolean Amenities ;
	Suite()
	{
		System.out.println("Suite Room Created");
	}
	public boolean isAmenities() {
		return Amenities;
	}
	public void setAmenities(boolean amenities) {
		Amenities = amenities;
	}
}
