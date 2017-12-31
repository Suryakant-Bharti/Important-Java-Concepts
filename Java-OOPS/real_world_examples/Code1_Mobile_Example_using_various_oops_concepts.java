
package abc;

import java.util.*;
 
abstract class Machine 
{
    int weight;

    void Start()
    {
        System.out.println("I am Running");
    }
}

abstract class ElectronicsDevice extends Machine
{
    String color;
    int[] dimensions;
}

class Camera
{
	private String company; 
	private int megaPixel; 

	Camera(String company, int megaPixel)
	{
		this.company = company;
		this.megaPixel = megaPixel;
	}

    void run() 
    {
    	System.out.println(this.megaPixel + this.company + "Camera is running");
    }
}

class AudioDevice
{
    void run() 
    {
    	System.out.println("Audio Player is running");
    }
}

class SimCard
{
    private String company; 

    SimCard(String company)
	{
		this.company = company;
	}

    void run() 
    {
    	System.out.println(this.company + "SIM is running");
    }
}

class ExternalMemory
{
    private int memory; 

    ExternalMemory(int memory)
	{
		this.memory = memory;
	}

    void run() 
    {
    	System.out.println(this.memory + "GB memory card is running");
    }
}

class TouchScreen 
{
    private String company; 
	private String resolution; 

	TouchScreen(String company, String resolution)
	{
		this.company = company;
		this.resolution = resolution;
	}

    void run() 
    {
    	System.out.println(this.company + this.resolution + "Touch Screen is running");
    }
}

interface CameraFeatures 
{
    void CameraFeaturesName();
}

interface WebBrowser 
{
    void WebBrowserName();
}

abstract class SmartPhone extends ElectronicsDevice implements CameraFeatures, WebBrowser
{
	String IMEI_Number;
}

interface MobileOS 
{
    void OSName();
}

abstract class AndroidMobile extends SmartPhone implements MobileOS
{
	public void OSName()
    {
        System.out.println("Android OS is running");
    }

	public void WebBrowserName() 
    {
    	System.out.println("Chrome Browser is running");
    }
}

interface ThirdPartyUI
{
    void UIFeatures();
}

class SamsungGalaxyS8 extends AndroidMobile implements ThirdPartyUI
{
    int weight = 200;
    String color = "Silver";
    int[] dimensions = {120, 50, 7};

    private SimCard simCard;
    private ExternalMemory externalMemory;

    private final String IMEI_Number = "YJKSHKJD1680000789";
    
    private final Camera camera;
    private final AudioDevice audioPlayer;
    private final TouchScreen touchScreen;

    SamsungGalaxyS8(SimCard simCard, ExternalMemory externalMemory)
    {
 	   	this.simCard = simCard;
    	this.externalMemory = externalMemory;

    	this.camera = new Camera("Sony Camera", 20);
    	this.audioPlayer = new AudioDevice();
    	this.touchScreen = new TouchScreen("LG LED Screen", "Full HD");
    }
    
    void Start()
    {
        System.out.println("Mobile has started");
        this.OSName();
        this.touchScreen.run();
        this.UIFeatures();
    }

    public void CameraFeaturesName() 
    {
    	System.out.println("Cool Samsung camera features running");
    }

    public void UIFeatures() 
    {
    	System.out.println("Samsung TouchWiz UI features running");
    }

    void startCamera()
    {
        this.camera.run();
        this.CameraFeaturesName();
    }

    void startBrowser()
    {
        this.WebBrowserName();
    }

    void startAudio()
    {
        this.audioPlayer.run();
    }

    String getIMEI()
    {
        return this.IMEI_Number;
    }
}
 
// main method
public class abc
{
    public static void main (String[] args) 
    {
        SimCard s1 = new SimCard("Airtel");
        ExternalMemory e1 = new ExternalMemory(128);

        SamsungGalaxyS8 mobile1 = new SamsungGalaxyS8(s1, e1);
        
        mobile1.Start();
        mobile1.startCamera();
        mobile1.startBrowser();
        mobile1.startAudio();
    }
}