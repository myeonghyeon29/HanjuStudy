package middle;

class Geo
{
	public double latitude;
	public double longitude;
	
}
public class _32_Geopoint {

	public static void main(String[] args) {
		Geo ggeo =new Geo();
		double latitude1 = 10.29;
		double longitude1 = 2.29;
		double latitude2 = 11.30;
		double longitude2 = 3.30;
		
		System.out.println(latitude1+"\t"+longitude1);
		double geo1[]= {latitude1,longitude1};
		double geo2[]= {latitude2,longitude2};
		System.out.println(geo1[0]+"\t"+geo1[1]);
		double geogeo[][]= {{latitude1,longitude1},{latitude2,longitude2}};
		System.out.println(geogeo[0][0]+"\t"+geogeo[0][1]+"\n"+geogeo[1][0]+"\t"+geogeo[1][1]);
	}
}
