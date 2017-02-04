package classes;

public class Triangle {
	Point point1, point2, point3;

	
	
	public Triangle(Point point1, Point point2, Point point3) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	
	public String type(){
		String type = null;
		double distance1 = point1.distance(point2);
		double distance2 = point1.distance(point3);
		double distance3 = point2.distance(point3);
		
		if((distance1 == distance2) && (distance1 == distance3)){
			type = "Equals";
		}else if((distance1 == distance2) || (distance1 == distance3) || (distance2 == distance3)){
			type = "isocel";
		}else if(Math.pow(distance3, 2) == Math.sqrt(Math.pow(distance1, 2) + Math.pow(distance2, 2))){ //la relation de Pitaguore
			type = "rectangle";
		}else if(Math.pow(distance3, 2) == Math.sqrt(Math.pow(distance1, 2) + Math.pow(distance2, 2)) && distance1 == distance2){
			type = "rectangle isocel";
		}else{
			type = "scalene";
		}
		
		return type;
	}
	
	public boolean estTriangle(){
		boolean rep = true;
		if(point1.equals(point2) || point1.equals(point3) || point2.equals(point3)){
			rep = false;
		}
		return rep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((point1 == null) ? 0 : point1.hashCode());
		result = prime * result + ((point2 == null) ? 0 : point2.hashCode());
		result = prime * result + ((point3 == null) ? 0 : point3.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (point1 == null) {
			if (other.point1 != null)
				return false;
		} else if (!point1.equals(other.point1))
			return false;
		if (point2 == null) {
			if (other.point2 != null)
				return false;
		} else if (!point2.equals(other.point2))
			return false;
		if (point3 == null) {
			if (other.point3 != null)
				return false;
		} else if (!point3.equals(other.point3))
			return false;
		return true;
	}

}
