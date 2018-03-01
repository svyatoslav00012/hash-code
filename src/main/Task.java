package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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

	public void read(File file){
		try {
			FileInputStream in = new FileInputStream(file);
			read(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void read(){
		read(System.in);
	}

	public void read(InputStream inStream){
		Scanner in = new Scanner(inStream);
		rows = in.nextInt();
		columns = in.nextInt();
		vehicles = in.nextInt();
		rides = in.nextInt();
		bonus = in.nextInt();
		steps = in.nextInt();
		System.out.println(toString());
		int x1, y1, x2, y2, s, f;
		for(int i = 0; i < rides; ++i) {
			x1 = in.nextInt();
			y1 = in.nextInt();
			x2 = in.nextInt();
			y2 = in.nextInt();
			s = in.nextInt();
			f = in.nextInt();
			routes.add(new Route(x1, y1, x2, y2, s, f));
		}
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

	public String toString(){
		return "rows = " + rows +
				"\ncolumns = " + columns +
				"\nvehicles = " + vehicles +
				"\nrides = " + rides +
				"\nbonus = " + bonus +
				"\nsteps = " + steps + "\n";
	}
}
