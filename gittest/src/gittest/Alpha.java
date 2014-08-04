package gittest;

public class Alpha {
private String name;

public synchronized String getName() {
	return name;
}

public synchronized void setName(String name) {
	this.name = name;
}
}
