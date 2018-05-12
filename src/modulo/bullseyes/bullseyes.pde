
void setup(){
size(800,600);

}


void draw(){


int a=250;
for (int i = 10; i > 5; i--) {  
if(i%2==0){
fill(255,0,0);
}
else{
fill(255,255,255);
}
  ellipse(400,300,a,a);
a-=50;
  
}
int d=200;
int c=600;
void setup(){
size(800,600);
 
}
void draw(){
background(40,0,165
);
  int a=250;
for (int i = 10; i > 5; i--) {  
  noFill();
  ellipse(c,300,a,a);
a-=50;
 c-=1;}
  int b=250;
for (int i = 10; i > 5; i--) {  
noFill();
  ellipse(d,300,b,b);
b-=50;
d+=1;
}

}
}