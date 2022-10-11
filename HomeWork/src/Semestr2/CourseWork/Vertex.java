package Semestr2.CourseWork;

public class Vertex {
    private String IP;
    private boolean visited;

    public Vertex(String IP) {
        this.IP = IP;
        visited = false;
    }
    public boolean getVisited() {
        return visited;
    }
    public void setVisited(boolean state) {
        visited = state;
    }
    public String getIP() {
        return IP;
    }
}
