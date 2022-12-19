package day01drivermethod;

public class SeleniunKodlari {
    /*Selenium da sik kullanacagimiz methodlar

               1)  driver.get(); Method’lari
        driver.get( String Url ); => String olarak girilen Url’e gider
        driver.getTitle( ); => Icinde olunan sayfanin basligini String olarak getirir
        driver.getCurrentUrl( ); =>  Icinde olunan sayfanin Url’ini String olarak getirir
        driver.getPageSource( ); =>  Icinde olunan sayfanin kaynak kodlarini String olarak getirir
        driver.getWindowHandle( ); =>  Icinde olunan sayfa ve/veya tab’larin
        driver.getWindowHandles( ); =>  handle degerlerini getirir
                2) driver.navigate(); Method’lari
        driver.navigate( ).to( String Url ); => String olarak girilen Url’e gider
        driver.navigate( ).back ( ); => Icinde olunan sayfadan, geldigi onceki sayfaya dondurur
        driver.navigate( ).forward ( ); => Back ile donulen bir sayfadan tekrar ileri gider
        driver.navigate( ).refresh ( ); => Icinde olunan sayfayi yeniler
                3) driver.manage( ).window( );Method’lari
        driver.manage( ).window( ).maximize( );  =>  Browser’i maximize yapar
        driver.manage( ).window( ).minimize( );  =>  Browser’i minimize yapar
        driver.manage( ).window( ).fullscreen( );  =>  Browser’i full screen yapar
        driver.manage( ).window( ).getPosition( );  =>  Browser’in koordinatlarini verir
        driver.manage( ).window( ).getSize( );  =>  Browser’in olculerini verir
                4) driver.manage( ).Method’lari
        driver.manage( ).window( ).setPosition(new Point ( x:80 , y:0 ) ) ;  =>  Browser’i istenen koordinata tasir
        driver.manage( ).window( ).setSize(new Dimension( 800 , 600 ));  => Browser’i istenen olculere getirir.
        driver.manage( ).timeouts( ).implicitlyWait(Duration.ofSeconds(10));  => Istenen sayfa acilincaya kadar maximum bekleme suresini belirtir
        driver.close( );  => sadece calisilan browser'i kapatir
        driver.quit( );  => acik olan tum browser'lari kapatir
         */
}
