public interface MotelRoomVisitor {
	public void visit(Regular room);
	public void visit(Deluxe room);
	public void visit(Suite room);
	public void visit(FoodBar room);
	public void visit(RefillBar room);
	public void visit(Shower room);
	public void visit(Spa room);
}
