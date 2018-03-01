package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {
	private int rows;
	private int columns;
	private int vehicles;
	private int rides;
	private int bonus;
	private int steps;
	ArrayList<Route> routes;

	public Task() {
		routes = new ArrayList<>();
	}

	public void read(){
		Scanner in = new Scanner(System.in);
		rows = in.nextInt();
		columns = in.nextInt();
		vehicles = in.nextInt();
		rides = in.nextInt();
		bonus = in.nextInt();
		steps = in.nextInt();
		for(int i = 0; i < rides; ++i)
			routes.add(Route.read());
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	public int getRides() {
		return rides;
	}

	public void setRides(int rides) {
		this.rides = rides;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}
}
