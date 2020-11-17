class Arbolito{
	public static void main(String [] ar){
		System.out.println("                 ");
		System.out.println("   HAPPY NEW YEAR");
			String salida="";
			char[] reemplazo={' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
			for(int i=9, j=9; j>0; i++,j--){
				char asterisco='$';
				reemplazo[i] =asterisco;
				reemplazo[j] =asterisco;
				salida =new String(reemplazo);
				System.out.println(salida);
			}
			System.out.println("        $$$\n        $$$\n        $$$");
			System.out.println("                        ");
			System.out.println("  Alfredihdz 17-nov-2020");
	}
}