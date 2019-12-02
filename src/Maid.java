public class Maid implements MotelRoomVisitor {

	@Override
	public void visit(Regular room) {
		System.out.println("Maid is visiting Regular room.\n\tAll linens changed.\n\tTowels on floor replaced.");
	}

	@Override
	public void visit(Deluxe room) {
		System.out.println("Maid is visiting Deluxe room.\n\tAll linens changed.\n\tAll towels replaced.");

	}

	@Override
	public void visit(Suite room) {
		System.out.println("Maid is visiting Suite.\n\tAll linens changed.\n\tAll towels replaced.\n\tHamburger placed on pillow.");
	}

	@Override
	public void visit(FoodBar room) {
		System.out.println("\n\nFood Bar unlocked.");
	}

	@Override
	public void visit(RefillBar room) {
		System.out.println("\n\tFood Bar restock authorized.");
	}

	@Override
	public void visit(Shower room) {
		System.out.println("\n\tSpray-Resistant Shower unlocked and cleaned.");
	}

	@Override
	public void visit(Spa room) {
		System.out.println("\n\tSpa unlocked and cleaned.");		
	}

}
