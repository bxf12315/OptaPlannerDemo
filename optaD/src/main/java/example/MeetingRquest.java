package example;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.optaplanner.core.api.domain.entity.PlanningEntity
public class MeetingRquest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label("AttenderNumber")
   private int attenderNumber;
   @org.kie.api.definition.type.Label("meetingRome")
   @org.optaplanner.core.api.domain.variable.PlanningVariable(valueRangeProviderRefs = { "roomRange" })
   private example.MeetingRoom meetingRome;

   public MeetingRquest()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public int getAttenderNumber()
   {
      return this.attenderNumber;
   }

   public void setAttenderNumber(int attenderNumber)
   {
      this.attenderNumber = attenderNumber;
   }

   public example.MeetingRoom getMeetingRome()
   {
      return this.meetingRome;
   }

   public void setMeetingRome(example.MeetingRoom meetingRome)
   {
      this.meetingRome = meetingRome;
   }

   public MeetingRquest(java.lang.String name, int attenderNumber,
         example.MeetingRoom meetingRome)
   {
      this.name = name;
      this.attenderNumber = attenderNumber;
      this.meetingRome = meetingRome;
   }

}