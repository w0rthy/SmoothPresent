package smoothpresentmaker;

import enhancedstream.*;
import java.io.File;
import java.io.FileOutputStream;

public class SmoothPresentMaker {

    public static void main(String[] args) throws Throwable {
        EnhancedOutputStream eos = new EnhancedOutputStream(new FileOutputStream(new File("presentation.bin")));
        //NUM SLIDES
        eos.writeCmpInt(14);
        
        TitleSlide(eos,"Devolution\nFederalism");
        
        
        //SLIDE 1-1 1-2
        SimpleTextSlide(eos, "Transition to Devolution", "With the passing of the Cold War, the National Government, which had accrued power to focus on World War 2 and the Cold War, began to make moves to give power back to the states. This process which was first introduced by president Ronald Reagen became known as Devolution Federalism.\n\n"
                + "In Devolution, the National Government allocates more power to the lesser State Governments. This form of Federalism is clearly seen in the Temporary Assistance for Needy Families program.\n\n"
                + "The Temporary Assistance for Needy Families program was designed to give welfare grants to states, which in turn provide financial and service assistance for families. The federal government gives states flexibility in the use of grants, and the states get to define and encourage work activities for people who apply for benefits. This allows states to give more assistance to working families where the federal time limits won’t apply.",
                null, null);
        
        SimpleTextSlide(eos, "Differences from Creative Federalism", "Creative federalism gave more power to the national government by bypassing the state governments and allowing the federal government to have more control over the state governments. This is also known as “Picket- fence federalism”. The national government began to become more involved with the welfare programs in hopes of creating a better nation. In this era, the state governments were overlooked at times. In this type of federalism the state powers` were significantly weakened.\n" +
"\n" + "	New Federalism came about in the 1980s during the time of former president Ronald Reagan. In this era, more power was returned to the state in order to return the balance of power. One of the ways that this was achieved was by using block grants. Block grants were money that the states used with little restrictions, and they were able to handle the money accordingly. Basically, the national government was giving states funds for whatever they wanted. And in essence the national government gave more power back to the states.",
                null, null);
        //SLIDE 1
        SimpleTextSlide(eos, "Time Frame of New Federalism", "Reagan's ideology is associated with New Federalism. New Federalism, which is characterized by a gradual return of power to the states, was initiated by President Ronald Reagan (1981–1989) with his \"devolution revolution\" in the early 1980s, and lasted until 2001. The primary objective of New Federalism, unlike that of the eighteenth-century political philosophy of Federalism, is the restoration to the states of some of the autonomy and power that they lost to the federal government as a consequence of President Franklin Roosevelt's New Deal.",
                null, null);
        
        //SLIDE 2
        SimpleTextSlide(eos, "Community Development Act of 1974", "President Richard Nixon made a perpetual debate over the division of power in our federalist system. He was focused on dealing with domestic affairs centered on a new vision of how power should be shared between the federal government and the states. During his term, Nixon was able to develop a successful program called The Community Development Act of 1974 which still exists to this day. To generalize, it authorizes the payment of rental housing assistance to private landlords on behalf of low-income households in the United States. The act was funded with block grants and is why it is important to the era of New Federalism.",
                null, null);
        
        //SLIDE 3
        SimpleTextSlide(eos, "Block Grants", "As a policy theme, New Federalism typically involves the federal government providing block grants to the states to resolve a social issue. The federal government then monitors outcomes but provides broad discretion to the states for how the programs are implemented. An advantage of block grants is that they allow regional governments to experiment with different ways of spending money with the same goal in mind. Disadvantages are that it is very difficult to compare the results of such spending and reach a conclusion and that regional governments might be able to use the money as if they collected it through their own taxation systems to spend it, without any restrictions from above.",
                null, null);
        
        //SLIDE 4
        SimpleTextSlide(eos, "1996 Welfare Reforms", "Food Stamps: Clinton managed to preserve national standards and the guarantee that the poor will obtain food stamps. Congress had called for letting the states do whatever they wanted with food stamp money and program eligibility requirements.\n\n" +
"Child Care: Clinton succeeded in strengthening day care support for children of welfare recipients. Congress had been demanding much deeper cuts.\n\n" +
"Medicaid: Clinton demanded and won the fight to guarantee Medicaid coverage, which generally helps the disabled and poor children. Congress wanted to let states do whatever they wanted with Medicaid, including taking Medicaid funds and using them for other purposes.",
                null, null);
        
        //SLIDE 5
        SimpleTextSlide(eos, "Obama's Clean Power Plan", "This event shows how devolution is occurring even to this day. The Environmental Protection Agency is a federal agency created in the 1970s to better protect human health and the environment. President Obama's recent Clean Power Plan falls under the administration of the EPA. It's a program designed to decrease the amount of carbon pollution created by power plants. The program will be largely administered at the state level, where the states will both identify their needs and set their own goals, but using federal guidelines.",
                null, null);
        
        //SLIDE 6
        SimpleTextSlide(eos, "Amendments", "The 26th amendment was passed during the Devolution period, prohibiting both, the federal and the state government(s), from using age as a reason for denying citizens, who are at least 18, the right to vote. The federal government and states are subjected to the same limits on their exercises of power for this matter.",
                null, null);
        
        SimpleTextSlide(eos, "U.S. vs Lopez", "The Gun-Free School Zones Act of 1990 (GFSZA) made it unlawful for any individual knowingly to possess a firearm in a school zone.\n\n" +
"Federal agents charged Alfonso Lopez with violating this act, concluding that the GFSZA was a constitutional exercise of Congress’ power following the Commerce Clause of Article I concerning interstate commerce.\n\n" +
"The Supreme Court decided that the GFSZA exceeded Congress’ authority under the Commerce Clause and had no substantial affect to interstate commerce.\n\n" +
"This case helped to revise the role of the states in public policymaking and helped in the devolution of Federalism.",
                null, null);
        
        SimpleTextSlide(eos, "Mack & Printz vs U.S.", "The Brady Handgun Violence Prevention Act (Brady Bill) required local chief law enforcement officers to perform background-checks on prospective handgun purchasers using the Necessary and Proper Clause of Article I as justification.\n\n" +
"County sheriffs Jay Printz and Richard Mack, separately challenged the constitutionality of this act.\n\n" +
"The Supreme Court based its opinion on the principle that state legislatures are not subject to federal direction. The Court explained that while Congress may require the federal government to regulate commerce directly, the Necessary and Proper Clause does not empower it to require state officers to fulfill its federal tasks for it.",
                null, null);
        
        SimpleTextSlide(eos, "U.S. vs Morrison", "Christy Brzonkala sued Antonio Morrison and James Crawford in Federal District Court, alleging that Morrison's and Crawford's sexual assault violated the Violence Against Women Act of 1994 (VAWA), which provides a federal civil remedy for the victims of gender-motivated violence.\n\n" +
" Morrison and Crawford moved to dismiss Brzonkala's lawsuit on the ground that VAWA section 13981's civil remedy was unconstitutional.\n\n" +
"The Supreme Court found that congress lacked authority to enact section 13981 under either the Commerce Clause or the Fourteenth Amendment, which Congress had explicitly stated as the sources of federal authority for the act.\n\n" +
"Ultimately, parts of the VAWA were found unconstitutional because they exceeded congressional power under the stated sources of federal authority. Also showing the limited power of the federal government.",
                null, null);
        
        //SLIDE 7
        SimpleTextSlide(eos, "The Cake", "A layered cake best represents Devolution Federalism because the Federal and States are divided up evenly. After FDR’s New Deal the federal government had most of the powers and responsibilities, but after Reagan became president and set the stage for a devolution revolution or a New Federalism, states started to regain power again and the government system started to balance out as federal and state government are becoming balanced again.",
                null, null);
        
        //RESOURCES SLIDE
        SimpleTextSlide(eos, "Resources", "*Non-Original*\n\nJava Standard Edition 8u45b14 / JDK 1.8.0_45\nNetbeans 8.0.2\n\n*Original*\n\nEnhancedStream, Bitwise Compression Binary I/O\njSAS\n\n\nSource Code available at https://github.com/w0rthy",
                null, null);
        
        eos.flush();
        eos.close();
    }

    public static void SimpleTextSlide(EnhancedOutputStream eos, String title, String text, String image1, String image2) throws Throwable {
        //SLIDE 1
        
        int elems = 2;
        if(image1 != null)
            elems++;
        if(image2 != null)
            elems++;
        
        //NUM ELEMENTS
        eos.writeCmpInt(elems);
        
        //ELEMENT 1
        eos.write(0);
        eos.writeString(title);
        
        eos.writeCmpFlt(0.5f);
        eos.writeCmpFlt(0.1f);
        
        eos.write(1);
        
        eos.write(0);
        eos.write(0);
        eos.write(0);
        
        //ELEMENT 2
        eos.write(0);
        eos.writeString(text);
        
        eos.writeCmpFlt(0.5f);
        eos.writeCmpFlt(0.25f);
        
        eos.write(0);
        
        eos.write(0);
        eos.write(0);
        eos.write(0);
        
        //ELEMENT 3
        if(image1 != null){
            eos.write(1);
            eos.writeString(image1);
            
            eos.writeCmpFlt(0.05);
            eos.writeCmpFlt(0.3);
            
            eos.writeCmpFlt(0.2);
            eos.writeCmpFlt(0.2);
        }
        
        //ELEMENT 4
        if(image2 != null){
            eos.write(1);
            eos.writeString(image2);
            
            eos.writeCmpFlt(0.05);
            eos.writeCmpFlt(0.3);
            
            eos.writeCmpFlt(0.2);
            eos.writeCmpFlt(0.2);
        }
    }

    private static void TitleSlide(EnhancedOutputStream eos, String title) throws Throwable {
         //ELEMENT 1
        eos.writeCmpInt(1);
        
        eos.write(0);
        eos.writeString(title);
        
        eos.writeCmpFlt(0.5f);
        eos.writeCmpFlt(0.33f);
        
        eos.write(1);
        
        eos.write(0);
        eos.write(0);
        eos.write(0);
    }
}
