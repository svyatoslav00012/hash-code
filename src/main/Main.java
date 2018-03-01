package main;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		task.read();
		for(int i = 0; i < task.getRoutes().size(); ++i)
			for(int j = 0; j < task.getRoutes().size(); ++j)
				System.out.println(task.getRoutes().get(i).compareTo(task.getRoutes().get(j)));
		//task.read(new File("input.txt"));
	}
}
