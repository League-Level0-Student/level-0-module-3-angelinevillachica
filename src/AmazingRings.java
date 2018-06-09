
public class AmazingRings {

}
int w1=50;
int c=110;
int w2=50;
int d=700;
int speed=1;
void setup(){
size(800,600);
}
void draw(){
background(40,0,165);


for (int i =0;i<6; i++) {  
noFill();
ellipse(c,300,w1,w1);
w1+=50;

c+=speed;
}
for (int i =0;i<6; i++) {  
noFill();
ellipse(d,300,w2,w2);
w2+=50;
d-=speed;

}
if(c>=width||c<=0){speed=speed*-1;}

w1=50;
w2=50;
}
