/**
 * Sets functionality of MotelRoomVisitors
 * @author Chloe Culver
 * Input: none;
 *Output: none;
 */
public interface MotelRoomVisitor {
	public void visit(BaseRoom room);
	public void visit(Amenity room);
}
