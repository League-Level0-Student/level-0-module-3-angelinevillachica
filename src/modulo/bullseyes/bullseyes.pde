void setup(){
size(800,600);

}


void draw(){


int a=250;

for (int i = 10; i > 5; i--) {
  ellipse(400,300,a,a);
a-=50;
}

}