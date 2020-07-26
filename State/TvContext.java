// Context object that will change its behavior based on its internal state
package State;

public class TvContext implements State{
   private State tvstate;
   public void setState(State state){
       this.tvstate=state;
   }
   public State getState(){
       return tvstate;
   }
   public void doAction(){
       tvstate.doAction();
   }
}
