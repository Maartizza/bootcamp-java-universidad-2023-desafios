package ar.com.educationit.universidad.desafio.Java4;

public class Main {

	public static void main(String[] args) {
		CollectionCustom<Integer> collection = new CollectionCustom<>();

        collection.addFirst(1);
        collection.addLast(2);
        collection.add(3);
        collection.addFirst(4);
        collection.addLast(5);

        System.out.println("Size: " + collection.size()); // Output: 5

        System.out.println("Removed element: " + collection.remove(2)); // Output: 2

        collection.removeAll(4);

        System.out.println("Size: " + collection.size()); // Output: 2

        System.out.println("Is empty: " + collection.empty()); // Output: false
    }



	}


