package designpatterns;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
