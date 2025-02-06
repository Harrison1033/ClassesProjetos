public class ClassD {
    public void imprimir() {
        int horas, minutos, segundos;
        for (horas = 0; horas < 24; horas++) {
            for (minutos = 0; minutos < 60; minutos++) {
                for (segundos = 0; segundos < 60; segundos++) {
                    System.out.println(horas + "h" + minutos + "m" + segundos + "s");
                    try {
                        Thread.sleep(1000);//O Thread não é a melhor forma de fazer um temporizador...
                        if (segundos == 10) {//para isso, deve se usar o Timer e o TimerTask
                            System.exit(0);//No caso, isso é só um exemplo simples.
                        }
                    } catch (InterruptedException e) {
                        e.toString();
                    }
                }
            }
        }
        System.exit(0);
    }
}
