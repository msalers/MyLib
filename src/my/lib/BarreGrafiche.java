package my.lib;

/**
 * La classe visualizza delle barre di stato riguardo alla fame, alla salute ecc
 * @author maria
 *
 */
public class BarreGrafiche {
	
	public BarreGrafiche(){}
	
	public String getBar(double stato){
		String BarraStato="";
		
			 if(stato<=10){ BarraStato ="[         ]";}
		else if(stato<=20){ BarraStato ="[-        ]";}
		else if(stato<=30){ BarraStato ="[--       ]";}
		else if(stato<=40){ BarraStato ="[---      ]";}
		else if(stato<=50){ BarraStato ="[----     ]";}
		else if(stato<=60){ BarraStato ="[-----    ]";}
		else if(stato<=70){ BarraStato ="[------   ]";}
		else if(stato<=80){ BarraStato ="[-------  ]";}
		else if(stato<=90){ BarraStato ="[-------- ]";}
		else if(stato<=100){BarraStato ="[---------]"; }
		
		return BarraStato;
	}

}
