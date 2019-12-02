import java.util.ArrayList;

public class Maid implements MotelRoomVisitor {

	@Override
	public void visit(BaseRoom room) {
		System.out.println("Maid is visiting " + room.getClass().getSimpleName() + " room at room number " + room.getRoomNumber()); 
		if(room.isDisturbable()) {
			System.out.println("\tAll linens replaced.");
			if(room instanceof Regular) {
				System.out.println("\tAll towels on floor replaced.");
			}
			else if(room instanceof Deluxe) {
				System.out.println("\tAll towels replaced.");
			}
			else if(room instanceof Suite) {
				System.out.println("\tAll towels replaced.\n\tHamburger placed on pillow.");
			}
		}
		else System.out.println("\t\"Do Not Disturb\" sign was placed on the door, so maid will not enter.");
	}

	@Override
	public void visit(Amenity room) {
		if(room.isDisturbable()) {
			if(room instanceof FoodBar) {
				System.out.println("\tFood bar unlocked.");
			}
			else if(room instanceof RefillBar) {
				System.out.println("\tRefill of food bar authorized.");
			}
			else if(room instanceof Shower) {
				System.out.println("\tSpray-resistant shower unlocked and cleaned.");
			}
			else if(room instanceof Spa) {
				System.out.println("\tSpa unlocked and cleaned.");
			}
		}
	}
	
	public static void main(String[] args) {
		RoomBuilder builder = new RoomBuilder();
		String[] amenities = new String[4];
		amenities[0] = "foodbar";
		amenities[1] = "refillbar";
		amenities[2] = "shower";
		amenities[3] = "spa";
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < 4; i++) {
			list.add(amenities[(int)(Math.random() * 4)]);
		}
		MotelRoom room = builder.buildRoom(new RoachColony(), "Suite", list, 1);
		Maid maid = new Maid();
		room.accept(maid);
	}
}
