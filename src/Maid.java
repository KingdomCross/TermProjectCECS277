public class Maid implements MotelRoomVisitor {

	@Override
	public void visit(BaseRoom room) {
		System.out.println("Maid is visiting " + room.getClass().getSimpleName() + " room at room number " + room.getRoomNumber() + ":"
				+ "\n\tAll linens replaced.");
		if(room instanceof Regular) {
			System.out.println("\n\tAll towels on floor replaced.");
		}
		else if(room instanceof Deluxe) {
			System.out.println("\n\tAll towels replaced.");
		}
		else if(room instanceof Suite) {
			System.out.println("\n\tAll towels replaced.\n\tHamburger placed on pillow.");
		}
	}

	@Override
	public void visit(Amenity room) {
		if(room instanceof FoodBar) {
			System.out.println("\n\tFood bar unlocked.");
		}
		else if(room instanceof RefillBar) {
			System.out.println("\n\tRefill of food bar authorized.");
		}
		else if(room instanceof Shower) {
			System.out.println("\n\tSpray-resistant shower unlocked and cleaned.");
		}
		else if(room instanceof Spa) {
			System.out.println("\n\tSpa unlocked and cleaned.");
		}
	}
	
}
