class Link {
    public int data1;
    public double data2;
    public Link nextLink;

    //Link constructor
    public Link(int d1, double d2) {
        data1 = d1;
        data2 = d2;
    }

    //Print Link data
    public void printLink() {
        System.out.print("{" + data1 + ", " + data2 + "} ");
    }
}

public class LinkedList {
	public static void main(String[] args) {
		LinkedList newLink = new LinkedList();
		newLink.insert(5,5);
		newLink.isEmpty();
		
	}
    private Link first;

    //LinkList constructor
    public void LinkList() {
        first = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
        return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(int d1, double d2) {
        Link link = new Link(d1, d2);
        link.nextLink = first;
        first = link;
    }
    public void delete(Link a) {
    
    }
}