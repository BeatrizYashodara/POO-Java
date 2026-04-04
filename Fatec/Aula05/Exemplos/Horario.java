public class Horario {

/*
Tarefa 02

● No mesmo projeto:
○ Crie na classe Horário um método chamado “getHorário” sem
parâmetros que retorne uma String com o horário no formato
“HH:MM:SS”
SOLUÇÃO: 
*/

	public String getHorario(){
	String out = "";
	if(horas < 10) out += "0";
	out += horas + ":";
	if(minutos < 10) out += "0";
	out += minutos + ":";
	if(segundos < 10) out += "0";
	out += segundos;
	return out;
	}

/*
	Tarefa 03

● No mesmo projeto:
○ Crie na classe Horario:
■ Um construtor sem parâmetros que inicialize o objeto com
00:00:00
■ Um construtor parametrizado que inicialize o objeto com os
valores de horas, min e seg informados nos parâmetros
■ Use os métodos set ao invés de atribuir direto
	*/

  
}
