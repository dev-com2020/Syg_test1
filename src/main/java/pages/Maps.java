package pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Maps {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(2) div.dropdown.select-ilosc-pozycji div.dropdown-menu a:nth-of-type(1)")
    @CacheLookup
    private WebElement _10;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(2) div.dropdown.select-ilosc-pozycji div.dropdown-menu a:nth-of-type(4)")
    @CacheLookup
    private WebElement _100;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(2) div.dropdown.select-ilosc-pozycji div.dropdown-menu a:nth-of-type(2)")
    @CacheLookup
    private WebElement _20;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(2) div.dropdown.select-ilosc-pozycji div.dropdown-menu a:nth-of-type(3)")
    @CacheLookup
    private WebElement _50;

    @FindBy(css = "a.font0")
    @CacheLookup
    private WebElement a1;

    @FindBy(css = "a.font1")
    @CacheLookup
    private WebElement a2;

    @FindBy(css = "a.font2")
    @CacheLookup
    private WebElement a3;

    @FindBy(css = "#naglowekContainer header nav div.container-fluid div.row.mainHeaderRow div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div.accessbility-container div div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement a4;

    @FindBy(css = "a.letterCircle.blackLetterCircle")
    @CacheLookup
    private WebElement a5;

    @FindBy(css = "a[href='#ar']")
    @CacheLookup
    private WebElement arabic;

    @FindBy(id = "ShareBack")
    @CacheLookup
    private WebElement back1;

    @FindBy(css = "a[href='javascript:Microsoft.Translator.FloaterOnEmbedBackClick()']")
    @CacheLookup
    private WebElement back2;

    @FindBy(css = "a[href='http://www.bing.com/widget/translator']")
    @CacheLookup
    private WebElement bingWebmasterPortal;

    @FindBy(css = "a[href='#bg']")
    @CacheLookup
    private WebElement bulgarian;

    @FindBy(css = "a[href='#ca']")
    @CacheLookup
    private WebElement catalan;

    @FindBy(css = "#filtryJednostekContent div:nth-of-type(1) a.usun-filtr-link")
    @CacheLookup
    private WebElement centrumIntegracjiSpoecznej;

    @FindBy(css = "#filtryJednostekContent div:nth-of-type(2) a.usun-filtr-link")
    @CacheLookup
    private WebElement centrumUsugSpoecznych;

    @FindBy(css = "a[href='#zh-CHS']")
    @CacheLookup
    private WebElement chineseSimplified;

    @FindBy(css = "a[href='#zh-CHT']")
    @CacheLookup
    private WebElement chineseTraditional;

    @FindBy(css = "#stopkaContainer footer.container-fluid.footer div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement cyberbezpieczestwo;

    @FindBy(css = "a[href='#cs']")
    @CacheLookup
    private WebElement czech;

    @FindBy(css = "a[href='#da']")
    @CacheLookup
    private WebElement danish;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(3) div.dropdown.select-sortowanie div.dropdown-menu a:nth-of-type(3)")
    @CacheLookup
    private WebElement dataAktualizacjiMalejco;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(3) div.dropdown.select-sortowanie div.dropdown-menu a:nth-of-type(2)")
    @CacheLookup
    private WebElement dataAktualizacjiRosnco;

    @FindBy(css = "#stopkaContainer footer.container-fluid.footer div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement deklaracjaDostpnoci;

    @FindBy(id = "dla-urzednikow")
    @CacheLookup
    private WebElement dlaUrzdnikw;

    @FindBy(css = "a[href='#nl']")
    @CacheLookup
    private WebElement dutch;

    @FindBy(id = "filtr-podkategorie-kontroler-list-zwijalnych-1")
    @CacheLookup
    private WebElement dzieciIModzie;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(4) div.dropdown-menu a:nth-of-type(2)")
    @CacheLookup
    private WebElement eksportDanychZListyCsv;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(4) div.dropdown-menu a:nth-of-type(1)")
    @CacheLookup
    private WebElement eksportDanychZListyXlsx;

    @FindBy(id = "EmbedSnippetTextBox")
    @CacheLookup
    private WebElement enableCollaborativeFeaturesAndCustomizeWidget;

    @FindBy(css = "a[href='#en']")
    @CacheLookup
    private WebElement english;

    @FindBy(id = "LanguageMenu_svid")
    @CacheLookup
    private WebElement englishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese1;

    @FindBy(id = "LanguageMenu_textid")
    @CacheLookup
    private WebElement englishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese2;

    @FindBy(css = "a[href='#et']")
    @CacheLookup
    private WebElement estonian;

    @FindBy(css = "a[href='#fi']")
    @CacheLookup
    private WebElement finnish;

    @FindBy(css = "a[href='#fr']")
    @CacheLookup
    private WebElement french;

    @FindBy(css = "a[href='#de']")
    @CacheLookup
    private WebElement german;

    @FindBy(css = "a[href='#el']")
    @CacheLookup
    private WebElement greek;

    @FindBy(id = "filtr-podkategorie-checkbox-4-20")
    @CacheLookup
    private WebElement grupyWsparcia1;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-6 div.list-group.list-group-flush div:nth-of-type(4) a.usun-filtr-link")
    @CacheLookup
    private WebElement grupyWsparcia10;

    @FindBy(id = "filtr-podkategorie-checkbox-5-29")
    @CacheLookup
    private WebElement grupyWsparcia11;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-5 div.list-group.list-group-flush div:nth-of-type(5) a.usun-filtr-link")
    @CacheLookup
    private WebElement grupyWsparcia12;

    @FindBy(id = "filtr-podkategorie-checkbox-8-44")
    @CacheLookup
    private WebElement grupyWsparcia13;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-8 div.list-group.list-group-flush div:nth-of-type(5) a.usun-filtr-link")
    @CacheLookup
    private WebElement grupyWsparcia14;

    @FindBy(id = "filtr-podkategorie-checkbox-7-39")
    @CacheLookup
    private WebElement grupyWsparcia15;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-7 div.list-group.list-group-flush div:nth-of-type(5) a.usun-filtr-link")
    @CacheLookup
    private WebElement grupyWsparcia16;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-4 div.list-group.list-group-flush div:nth-of-type(5) a.usun-filtr-link")
    @CacheLookup
    private WebElement grupyWsparcia2;

    @FindBy(id = "filtr-podkategorie-checkbox-3-14")
    @CacheLookup
    private WebElement grupyWsparcia3;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-3 div.list-group.list-group-flush div:nth-of-type(5) a.usun-filtr-link")
    @CacheLookup
    private WebElement grupyWsparcia4;

    @FindBy(id = "filtr-podkategorie-checkbox-2-11")
    @CacheLookup
    private WebElement grupyWsparcia5;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-2 div.list-group.list-group-flush div:nth-of-type(5) a.usun-filtr-link")
    @CacheLookup
    private WebElement grupyWsparcia6;

    @FindBy(id = "filtr-podkategorie-checkbox-1-5")
    @CacheLookup
    private WebElement grupyWsparcia7;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-1 div.list-group.list-group-flush div:nth-of-type(5) a.usun-filtr-link")
    @CacheLookup
    private WebElement grupyWsparcia8;

    @FindBy(id = "filtr-podkategorie-checkbox-6-34")
    @CacheLookup
    private WebElement grupyWsparcia9;

    @FindBy(css = "a[href='#ht']")
    @CacheLookup
    private WebElement haitianCreole;

    @FindBy(css = "a[href='#he']")
    @CacheLookup
    private WebElement hebrew;

    @FindBy(css = "a[href='#hi']")
    @CacheLookup
    private WebElement hindi;

    @FindBy(css = "a[href='#mww']")
    @CacheLookup
    private WebElement hmongDaw;

    @FindBy(css = "a[href='#hu']")
    @CacheLookup
    private WebElement hungarian;

    @FindBy(css = "a[href='#id']")
    @CacheLookup
    private WebElement indonesian;

    @FindBy(css = "a[href='#it']")
    @CacheLookup
    private WebElement italian;

    @FindBy(id = "jakiej-pomocy-szukasz")
    @CacheLookup
    private WebElement jakiejPomocySzukasz;

    @FindBy(css = "a[href='#ja']")
    @CacheLookup
    private WebElement japanese;

    @FindBy(css = "#stopkaContainer footer.container-fluid.footer div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement klauzulaRodo;

    @FindBy(css = "a[href='#tlh']")
    @CacheLookup
    private WebElement klingon;

    @FindBy(css = "#filtryJednostekContent div:nth-of-type(3) a.usun-filtr-link")
    @CacheLookup
    private WebElement klubIntegracjiSpoecznej;

    @FindBy(css = "#wyszukiwanieContainer div.wyszukiwanieTlo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(3) div.dropdown-menu a:nth-of-type(1)")
    @CacheLookup
    private WebElement km0;

    @FindBy(css = "#wyszukiwanieContainer div.wyszukiwanieTlo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(3) div.dropdown-menu a:nth-of-type(3)")
    @CacheLookup
    private WebElement km10;

    @FindBy(css = "#wyszukiwanieContainer div.wyszukiwanieTlo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(3) div.dropdown-menu a:nth-of-type(6)")
    @CacheLookup
    private WebElement km100;

    @FindBy(css = "#wyszukiwanieContainer div.wyszukiwanieTlo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(3) div.dropdown-menu a:nth-of-type(4)")
    @CacheLookup
    private WebElement km20;

    @FindBy(css = "#wyszukiwanieContainer div.wyszukiwanieTlo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(3) div.dropdown-menu a:nth-of-type(2)")
    @CacheLookup
    private WebElement km5;

    @FindBy(css = "#wyszukiwanieContainer div.wyszukiwanieTlo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(3) div.dropdown-menu a:nth-of-type(5)")
    @CacheLookup
    private WebElement km50;

    @FindBy(css = "a[href='#ko']")
    @CacheLookup
    private WebElement korean;

    @FindBy(css = "a[href='#lv']")
    @CacheLookup
    private WebElement latvian;

    @FindBy(css = "button.wyszukiwanie-na-mapie")
    @CacheLookup
    private WebElement listaJednostek;

    @FindBy(css = "a[href='#lt']")
    @CacheLookup
    private WebElement lithuanian;

    @FindBy(css = "#naglowekContainer header nav div.container-fluid div.row.mainHeaderRow div:nth-of-type(1) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement logoRejestruJednostekPomocySpoecznej;

    @FindBy(css = "a[href='#ms']")
    @CacheLookup
    private WebElement malay;

    @FindBy(css = "a[href='#mt']")
    @CacheLookup
    private WebElement maltese;

    @FindBy(css = "#filtryJednostekContent div:nth-of-type(4) a.usun-filtr-link")
    @CacheLookup
    private WebElement miejskiOrodekPomocyRodzinie;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(3) div.dropdown.select-sortowanie div.dropdown-menu a:nth-of-type(5)")
    @CacheLookup
    private WebElement nazwaMalejco;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(3) div.dropdown.select-sortowanie div.dropdown-menu a:nth-of-type(7)")
    @CacheLookup
    private WebElement nazwaMiejscowociMalejco;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(3) div.dropdown.select-sortowanie div.dropdown-menu a:nth-of-type(6)")
    @CacheLookup
    private WebElement nazwaMiejscowociRosnco;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(3) div.dropdown.select-sortowanie div.dropdown-menu a:nth-of-type(4)")
    @CacheLookup
    private WebElement nazwaRosnco;

    @FindBy(css = "a[href='#no']")
    @CacheLookup
    private WebElement norwegian;

    @FindBy(css = "a[href='https://www.openstreetmap.org/copyright']")
    @CacheLookup
    private WebElement openstreetmap;

    @FindBy(css = "#filtryJednostekContent div:nth-of-type(5) a.usun-filtr-link")
    @CacheLookup
    private WebElement orodekPomocySpoecznej;

    @FindBy(id = "filtr-podkategorie-kontroler-list-zwijalnych-2")
    @CacheLookup
    private WebElement osobyZNiepenosprawnoci;

    private final String pageLoadedText = "Rejestr Jednostek Pomocy Społecznej";

    private final String pageUrl = "/RJPS/WJ/start.do?stronaListy=1&liczbaPozycjiLista=20&wersja=1&widocznyPanel=mapa";

    @FindBy(css = "a[href='#fa']")
    @CacheLookup
    private WebElement persian;

    @FindBy(css = "a[href='#pl']")
    @CacheLookup
    private WebElement polish;

    @FindBy(css = "#stopkaContainer footer.container-fluid.footer div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement politykaCookies;

    @FindBy(id = "filtr-podkategorie-checkbox-4-24")
    @CacheLookup
    private WebElement poradnictwo1;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-6 div.list-group.list-group-flush div:nth-of-type(3) a.usun-filtr-link")
    @CacheLookup
    private WebElement poradnictwo10;

    @FindBy(id = "filtr-podkategorie-checkbox-5-28")
    @CacheLookup
    private WebElement poradnictwo11;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-5 div.list-group.list-group-flush div:nth-of-type(4) a.usun-filtr-link")
    @CacheLookup
    private WebElement poradnictwo12;

    @FindBy(id = "filtr-podkategorie-checkbox-8-43")
    @CacheLookup
    private WebElement poradnictwo13;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-8 div.list-group.list-group-flush div:nth-of-type(4) a.usun-filtr-link")
    @CacheLookup
    private WebElement poradnictwo14;

    @FindBy(id = "filtr-podkategorie-checkbox-7-38")
    @CacheLookup
    private WebElement poradnictwo15;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-7 div.list-group.list-group-flush div:nth-of-type(4) a.usun-filtr-link")
    @CacheLookup
    private WebElement poradnictwo16;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-4 div.list-group.list-group-flush div:nth-of-type(4) a.usun-filtr-link")
    @CacheLookup
    private WebElement poradnictwo2;

    @FindBy(id = "filtr-podkategorie-checkbox-3-18")
    @CacheLookup
    private WebElement poradnictwo3;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-3 div.list-group.list-group-flush div:nth-of-type(4) a.usun-filtr-link")
    @CacheLookup
    private WebElement poradnictwo4;

    @FindBy(id = "filtr-podkategorie-checkbox-2-10")
    @CacheLookup
    private WebElement poradnictwo5;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-2 div.list-group.list-group-flush div:nth-of-type(4) a.usun-filtr-link")
    @CacheLookup
    private WebElement poradnictwo6;

    @FindBy(id = "filtr-podkategorie-checkbox-1-2")
    @CacheLookup
    private WebElement poradnictwo7;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-1 div.list-group.list-group-flush div:nth-of-type(4) a.usun-filtr-link")
    @CacheLookup
    private WebElement poradnictwo8;

    @FindBy(id = "filtr-podkategorie-checkbox-6-33")
    @CacheLookup
    private WebElement poradnictwo9;

    @FindBy(css = "a[href='#pt']")
    @CacheLookup
    private WebElement portuguese;

    @FindBy(css = "#filtryJednostekContent div:nth-of-type(6) a.usun-filtr-link")
    @CacheLookup
    private WebElement powiatoweCentrumPomocyRodzinie;

    @FindBy(id = "ilosc-jednostek")
    @CacheLookup
    private WebElement pozycjiNaStronie;

    @FindBy(css = "#filtryJednostekContent div:nth-of-type(7) a.usun-filtr-link")
    @CacheLookup
    private WebElement przedsibiorstwoSpoeczne;

    @FindBy(id = "filtr-podkategorie-kontroler-list-zwijalnych-8")
    @CacheLookup
    private WebElement przemoc;

    @FindBy(css = "#naglowekContainer header nav div.container-fluid div.row.mainHeaderRow div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(1) div.d-inline-block.main-text-frame div h1.main-full-text a")
    @CacheLookup
    private WebElement rejestrJednostekPomocySpoecznejRjps;

    @FindBy(id = "filtr-podkategorie-kontroler-list-zwijalnych-3")
    @CacheLookup
    private WebElement rodzina;

    @FindBy(css = "a[href='#ro']")
    @CacheLookup
    private WebElement romanian;

    @FindBy(css = "a[href='#ru']")
    @CacheLookup
    private WebElement russian;

    @FindBy(id = "filtr-podkategorie-kontroler-list-zwijalnych-4")
    @CacheLookup
    private WebElement seniorzy;

    @FindBy(css = "a[href='#sk']")
    @CacheLookup
    private WebElement slovak;

    @FindBy(css = "a[href='#sl']")
    @CacheLookup
    private WebElement slovenian;

    @FindBy(id = "sortComboList")
    @CacheLookup
    private WebElement sortowanie;

    @FindBy(css = "a[href='#es']")
    @CacheLookup
    private WebElement spanish;

    @FindBy(css = "a[href='#sv']")
    @CacheLookup
    private WebElement swedish;

    @FindBy(css = "button.input-group.input-typeahead.miejscowosc-szukaj.d-block.btn-wj.btn-wj-red")
    @CacheLookup
    private WebElement szukaj;

    @FindBy(css = "a[href='#th']")
    @CacheLookup
    private WebElement thai;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(2) div:nth-of-type(3) div.dropdown.select-sortowanie div.dropdown-menu a:nth-of-type(1)")
    @CacheLookup
    private WebElement trafnoNajwiksza;

    @FindBy(id = "ShareTextbox")
    @CacheLookup
    private WebElement translateWithCopyTheUrlBelow;

    @FindBy(id = "filtr-podkategorie-kontroler-list-zwijalnych-7")
    @CacheLookup
    private WebElement trudnaSytuacjaMaterialna;

    @FindBy(css = "a[href='#tr']")
    @CacheLookup
    private WebElement turkish;

    @FindBy(id = "filtryTypyJednostek-kontroler-list-zwijalnych")
    @CacheLookup
    private WebElement typyJednostek;

    @FindBy(css = "a[href='#uk']")
    @CacheLookup
    private WebElement ukrainian;

    @FindBy(css = "a[href='#ur']")
    @CacheLookup
    private WebElement urdu;

    @FindBy(id = "filtr-podkategorie-checkbox-4-23")
    @CacheLookup
    private WebElement usugiAktywizujce1;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-6 div.list-group.list-group-flush div:nth-of-type(2) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiAktywizujce10;

    @FindBy(id = "filtr-podkategorie-checkbox-5-27")
    @CacheLookup
    private WebElement usugiAktywizujce11;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-5 div.list-group.list-group-flush div:nth-of-type(3) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiAktywizujce12;

    @FindBy(id = "filtr-podkategorie-checkbox-8-42")
    @CacheLookup
    private WebElement usugiAktywizujce13;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-8 div.list-group.list-group-flush div:nth-of-type(3) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiAktywizujce14;

    @FindBy(id = "filtr-podkategorie-checkbox-7-37")
    @CacheLookup
    private WebElement usugiAktywizujce15;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-7 div.list-group.list-group-flush div:nth-of-type(3) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiAktywizujce16;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-4 div.list-group.list-group-flush div:nth-of-type(3) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiAktywizujce2;

    @FindBy(id = "filtr-podkategorie-checkbox-3-17")
    @CacheLookup
    private WebElement usugiAktywizujce3;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-3 div.list-group.list-group-flush div:nth-of-type(3) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiAktywizujce4;

    @FindBy(id = "filtr-podkategorie-checkbox-2-9")
    @CacheLookup
    private WebElement usugiAktywizujce5;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-2 div.list-group.list-group-flush div:nth-of-type(3) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiAktywizujce6;

    @FindBy(id = "filtr-podkategorie-checkbox-1-1")
    @CacheLookup
    private WebElement usugiAktywizujce7;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-1 div.list-group.list-group-flush div:nth-of-type(3) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiAktywizujce8;

    @FindBy(id = "filtr-podkategorie-checkbox-6-32")
    @CacheLookup
    private WebElement usugiAktywizujce9;

    @FindBy(id = "filtr-podkategorie-checkbox-4-22")
    @CacheLookup
    private WebElement usugiDzienne1;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-6 div.list-group.list-group-flush div:nth-of-type(1) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiDzienne10;

    @FindBy(id = "filtr-podkategorie-checkbox-5-26")
    @CacheLookup
    private WebElement usugiDzienne11;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-5 div.list-group.list-group-flush div:nth-of-type(2) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiDzienne12;

    @FindBy(id = "filtr-podkategorie-checkbox-8-45")
    @CacheLookup
    private WebElement usugiDzienne13;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-8 div.list-group.list-group-flush div:nth-of-type(2) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiDzienne14;

    @FindBy(id = "filtr-podkategorie-checkbox-7-36")
    @CacheLookup
    private WebElement usugiDzienne15;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-7 div.list-group.list-group-flush div:nth-of-type(2) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiDzienne16;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-4 div.list-group.list-group-flush div:nth-of-type(2) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiDzienne2;

    @FindBy(id = "filtr-podkategorie-checkbox-3-13")
    @CacheLookup
    private WebElement usugiDzienne3;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-3 div.list-group.list-group-flush div:nth-of-type(2) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiDzienne4;

    @FindBy(id = "filtr-podkategorie-checkbox-2-8")
    @CacheLookup
    private WebElement usugiDzienne5;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-2 div.list-group.list-group-flush div:nth-of-type(2) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiDzienne6;

    @FindBy(id = "filtr-podkategorie-checkbox-1-4")
    @CacheLookup
    private WebElement usugiDzienne7;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-1 div.list-group.list-group-flush div:nth-of-type(2) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiDzienne8;

    @FindBy(id = "filtr-podkategorie-checkbox-6-31")
    @CacheLookup
    private WebElement usugiDzienne9;

    @FindBy(id = "filtr-podkategorie-checkbox-4-21")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe1;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-5 div.list-group.list-group-flush div:nth-of-type(1) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe10;

    @FindBy(id = "filtr-podkategorie-checkbox-8-41")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe11;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-8 div.list-group.list-group-flush div:nth-of-type(1) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe12;

    @FindBy(id = "filtr-podkategorie-checkbox-7-35")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe13;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-7 div.list-group.list-group-flush div:nth-of-type(1) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe14;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-4 div.list-group.list-group-flush div:nth-of-type(1) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe2;

    @FindBy(id = "filtr-podkategorie-checkbox-3-16")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe3;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-3 div.list-group.list-group-flush div:nth-of-type(1) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe4;

    @FindBy(id = "filtr-podkategorie-checkbox-2-7")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe5;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-2 div.list-group.list-group-flush div:nth-of-type(1) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe6;

    @FindBy(id = "filtr-podkategorie-checkbox-1-3")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe7;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-1 div.list-group.list-group-flush div:nth-of-type(1) a.usun-filtr-link")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe8;

    @FindBy(id = "filtr-podkategorie-checkbox-5-25")
    @CacheLookup
    private WebElement usugiOpiekuczeCaodobowe9;

    @FindBy(id = "filtr-podkategorie-kontroler-list-zwijalnych-6")
    @CacheLookup
    private WebElement uzalenienia;

    @FindBy(css = "a[href='#vi']")
    @CacheLookup
    private WebElement vietnamese;

    @FindBy(css = "a[href='#cy']")
    @CacheLookup
    private WebElement welsh;

    @FindBy(id = "miejscowosc")
    @CacheLookup
    private WebElement wpiszMiejscowo;

    @FindBy(id = "filtr-podkategorie-checkbox-4-19")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe1;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-5 div.list-group.list-group-flush div:nth-of-type(6) a.usun-filtr-link")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe10;

    @FindBy(id = "filtr-podkategorie-checkbox-7-40")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe11;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-7 div.list-group.list-group-flush div:nth-of-type(6) a.usun-filtr-link")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe12;

    @FindBy(id = "BFI_DATA")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe13;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-4 div.list-group.list-group-flush div:nth-of-type(6) a.usun-filtr-link")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe2;

    @FindBy(id = "filtr-podkategorie-checkbox-3-15")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe3;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-3 div.list-group.list-group-flush div:nth-of-type(6) a.usun-filtr-link")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe4;

    @FindBy(id = "filtr-podkategorie-checkbox-2-12")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe5;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-2 div.list-group.list-group-flush div:nth-of-type(6) a.usun-filtr-link")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe6;

    @FindBy(id = "filtr-podkategorie-checkbox-1-6")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe7;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-aktywne-filtry-1 div.list-group.list-group-flush div:nth-of-type(6) a.usun-filtr-link")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe8;

    @FindBy(id = "filtr-podkategorie-checkbox-5-30")
    @CacheLookup
    private WebElement wsparcieFinansoweIRzeczowe9;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-4 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(1)")
    @CacheLookup
    private WebElement wszystkie1;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-3 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(1)")
    @CacheLookup
    private WebElement wszystkie2;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-2 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(1)")
    @CacheLookup
    private WebElement wszystkie3;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-1 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(1)")
    @CacheLookup
    private WebElement wszystkie4;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-6 div.list-group.list-group-flush div:nth-of-type(5) button:nth-of-type(1)")
    @CacheLookup
    private WebElement wszystkie5;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-5 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(1)")
    @CacheLookup
    private WebElement wszystkie6;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-8 div.list-group.list-group-flush div:nth-of-type(6) button:nth-of-type(1)")
    @CacheLookup
    private WebElement wszystkie7;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-7 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(1)")
    @CacheLookup
    private WebElement wszystkie8;

    @FindBy(css = "button.odleglosc-button.btn.d-flex.align-items-center")
    @CacheLookup
    private WebElement wybierzOdlego1;

    @FindBy(id = "odleglosc")
    @CacheLookup
    private WebElement wybierzOdlego2;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-4 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(2)")
    @CacheLookup
    private WebElement wyczy1;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-3 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(2)")
    @CacheLookup
    private WebElement wyczy2;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-2 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(2)")
    @CacheLookup
    private WebElement wyczy3;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-1 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(2)")
    @CacheLookup
    private WebElement wyczy4;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-6 div.list-group.list-group-flush div:nth-of-type(5) button:nth-of-type(2)")
    @CacheLookup
    private WebElement wyczy5;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-5 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(2)")
    @CacheLookup
    private WebElement wyczy6;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-8 div.list-group.list-group-flush div:nth-of-type(6) button:nth-of-type(2)")
    @CacheLookup
    private WebElement wyczy7;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-7 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(2)")
    @CacheLookup
    private WebElement wyczy8;

    @FindBy(css = "#sortowanieContainer div div.container-fluid.mt-2 div.row div:nth-of-type(1) a")
    @CacheLookup
    private WebElement wyczyFiltry;

    @FindBy(css = "button.wyszukiwanie-szczegolowe")
    @CacheLookup
    private WebElement wyszukiwanieSzczegowe;

    @FindBy(css = "#wyszukiwanieContainer div.wyszukiwanieTlo div:nth-of-type(3) div:nth-of-type(2) div.row.d-flex div:nth-of-type(3) div.d-flex span.zapamietane-jednostki.wyszukiwanie-dodatkowe-right.disable a")
    @CacheLookup
    private WebElement zapamitaneJednostki;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-4 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(3)")
    @CacheLookup
    private WebElement zastosuj1;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-3 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(3)")
    @CacheLookup
    private WebElement zastosuj2;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-2 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(3)")
    @CacheLookup
    private WebElement zastosuj3;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-1 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(3)")
    @CacheLookup
    private WebElement zastosuj4;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-6 div.list-group.list-group-flush div:nth-of-type(5) button:nth-of-type(3)")
    @CacheLookup
    private WebElement zastosuj5;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-5 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(3)")
    @CacheLookup
    private WebElement zastosuj6;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-8 div.list-group.list-group-flush div:nth-of-type(6) button:nth-of-type(3)")
    @CacheLookup
    private WebElement zastosuj7;

    @FindBy(css = "#filtr-podkategorie-lista-zwijalna-edytowane-filtry-7 div.list-group.list-group-flush div:nth-of-type(7) button:nth-of-type(3)")
    @CacheLookup
    private WebElement zastosuj8;

    @FindBy(id = "filtr-podkategorie-kontroler-list-zwijalnych-5")
    @CacheLookup
    private WebElement zdrowie;

    public Maps() {
    }

    public Maps(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Maps(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Maps(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on A Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickA1Link() {
        a1.click();
        return this;
    }

    /**
     * Click on A Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickA2Link() {
        a2.click();
        return this;
    }

    /**
     * Click on A Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickA3Link() {
        a3.click();
        return this;
    }

    /**
     * Click on A Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickA4Link() {
        a4.click();
        return this;
    }

    /**
     * Click on A Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickA5Link() {
        a5.click();
        return this;
    }

    /**
     * Click on Arabic Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickArabicLink() {
        arabic.click();
        return this;
    }

    /**
     * Click on Back Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickBack1Link() {
        back1.click();
        return this;
    }

    /**
     * Click on Back Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickBack2Link() {
        back2.click();
        return this;
    }

    /**
     * Click on Bing Webmaster Portal Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickBingWebmasterPortalLink() {
        bingWebmasterPortal.click();
        return this;
    }

    /**
     * Click on Bulgarian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickBulgarianLink() {
        bulgarian.click();
        return this;
    }

    /**
     * Click on Catalan Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickCatalanLink() {
        catalan.click();
        return this;
    }

    /**
     * Click on Centrum Integracji Spoecznej Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickCentrumIntegracjiSpoecznejLink() {
        centrumIntegracjiSpoecznej.click();
        return this;
    }

    /**
     * Click on Centrum Usug Spoecznych Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickCentrumUsugSpoecznychLink() {
        centrumUsugSpoecznych.click();
        return this;
    }

    /**
     * Click on Chinese Simplified Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickChineseSimplifiedLink() {
        chineseSimplified.click();
        return this;
    }

    /**
     * Click on Chinese Traditional Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickChineseTraditionalLink() {
        chineseTraditional.click();
        return this;
    }

    /**
     * Click on Cyberbezpieczestwo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickCyberbezpieczestwoLink() {
        cyberbezpieczestwo.click();
        return this;
    }

    /**
     * Click on Czech Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickCzechLink() {
        czech.click();
        return this;
    }

    /**
     * Click on Danish Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickDanishLink() {
        danish.click();
        return this;
    }

    /**
     * Click on Data Aktualizacji Malejco Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickDataAktualizacjiMalejcoLink() {
        dataAktualizacjiMalejco.click();
        return this;
    }

    /**
     * Click on Data Aktualizacji Rosnco Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickDataAktualizacjiRosncoLink() {
        dataAktualizacjiRosnco.click();
        return this;
    }

    /**
     * Click on Deklaracja Dostpnoci Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickDeklaracjaDostpnociLink() {
        deklaracjaDostpnoci.click();
        return this;
    }

    /**
     * Click on Dla Urzdnikw Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickDlaUrzdnikwLink() {
        dlaUrzdnikw.click();
        return this;
    }

    /**
     * Click on Dutch Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickDutchLink() {
        dutch.click();
        return this;
    }

    /**
     * Click on Dzieci I Modzie Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickDzieciIModzieButton() {
        dzieciIModzie.click();
        return this;
    }

    /**
     * Click on Eksport Danych Z Listy Csv Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickEksportDanychZListyCsvLink() {
        eksportDanychZListyCsv.click();
        return this;
    }

    /**
     * Click on Eksport Danych Z Listy Xlsx Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickEksportDanychZListyXlsxLink() {
        eksportDanychZListyXlsx.click();
        return this;
    }

    /**
     * Click on English Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickEnglishLink() {
        english.click();
        return this;
    }

    /**
     * Click on Estonian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickEstonianLink() {
        estonian.click();
        return this;
    }

    /**
     * Click on Finnish Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickFinnishLink() {
        finnish.click();
        return this;
    }

    /**
     * Click on French Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickFrenchLink() {
        french.click();
        return this;
    }

    /**
     * Click on German Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGermanLink() {
        german.click();
        return this;
    }

    /**
     * Click on Greek Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGreekLink() {
        greek.click();
        return this;
    }

    /**
     * Click on Grupy Wsparcia Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGrupyWsparcia10Link() {
        grupyWsparcia10.click();
        return this;
    }

    /**
     * Click on Grupy Wsparcia Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGrupyWsparcia12Link() {
        grupyWsparcia12.click();
        return this;
    }

    /**
     * Click on Grupy Wsparcia Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGrupyWsparcia14Link() {
        grupyWsparcia14.click();
        return this;
    }

    /**
     * Click on Grupy Wsparcia Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGrupyWsparcia16Link() {
        grupyWsparcia16.click();
        return this;
    }

    /**
     * Click on Grupy Wsparcia Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGrupyWsparcia1Link() {
        if (!grupyWsparcia1.isSelected()) {
            grupyWsparcia1.click();
        }
        return this;
    }

    /**
     * Click on Grupy Wsparcia Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGrupyWsparcia2Link() {
        grupyWsparcia2.click();
        return this;
    }

    /**
     * Click on Grupy Wsparcia Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGrupyWsparcia4Link() {
        grupyWsparcia4.click();
        return this;
    }

    /**
     * Click on Grupy Wsparcia Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGrupyWsparcia6Link() {
        grupyWsparcia6.click();
        return this;
    }

    /**
     * Click on Grupy Wsparcia Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickGrupyWsparcia8Link() {
        grupyWsparcia8.click();
        return this;
    }

    /**
     * Click on Haitian Creole Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickHaitianCreoleLink() {
        haitianCreole.click();
        return this;
    }

    /**
     * Click on Hebrew Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickHebrewLink() {
        hebrew.click();
        return this;
    }

    /**
     * Click on Hindi Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickHindiLink() {
        hindi.click();
        return this;
    }

    /**
     * Click on Hmong Daw Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickHmongDawLink() {
        hmongDaw.click();
        return this;
    }

    /**
     * Click on Hungarian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickHungarianLink() {
        hungarian.click();
        return this;
    }

    /**
     * Click on Indonesian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickIndonesianLink() {
        indonesian.click();
        return this;
    }

    /**
     * Click on Italian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickItalianLink() {
        italian.click();
        return this;
    }

    /**
     * Click on Japanese Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickJapaneseLink() {
        japanese.click();
        return this;
    }

    /**
     * Click on Klauzula Rodo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickKlauzulaRodoLink() {
        klauzulaRodo.click();
        return this;
    }

    /**
     * Click on Klingon Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickKlingonLink() {
        klingon.click();
        return this;
    }

    /**
     * Click on Klub Integracji Spoecznej Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickKlubIntegracjiSpoecznejLink() {
        klubIntegracjiSpoecznej.click();
        return this;
    }

    /**
     * Click on 0 Km Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickKmLink0() {
        km0.click();
        return this;
    }

    /**
     * Click on 10 Km Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickKmLink10() {
        km10.click();
        return this;
    }

    /**
     * Click on 100 Km Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickKmLink100() {
        km100.click();
        return this;
    }

    /**
     * Click on 20 Km Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickKmLink20() {
        km20.click();
        return this;
    }

    /**
     * Click on 5 Km Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickKmLink5() {
        km5.click();
        return this;
    }

    /**
     * Click on 50 Km Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickKmLink50() {
        km50.click();
        return this;
    }

    /**
     * Click on Korean Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickKoreanLink() {
        korean.click();
        return this;
    }

    /**
     * Click on Latvian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickLatvianLink() {
        latvian.click();
        return this;
    }

    /**
     * Click on 10 Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickLink10() {
        _10.click();
        return this;
    }

    /**
     * Click on 100 Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickLink100() {
        _100.click();
        return this;
    }

    /**
     * Click on 20 Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickLink20() {
        _20.click();
        return this;
    }

    /**
     * Click on 50 Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickLink50() {
        _50.click();
        return this;
    }

    /**
     * Click on Lista Jednostek Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickListaJednostekButton() {
        listaJednostek.click();
        return this;
    }

    /**
     * Click on Lithuanian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickLithuanianLink() {
        lithuanian.click();
        return this;
    }

    /**
     * Click on Logo Rejestru Jednostek Pomocy Spoecznej Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickLogoRejestruJednostekPomocySpoecznejLink() {
        logoRejestruJednostekPomocySpoecznej.click();
        return this;
    }

    /**
     * Click on Malay Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickMalayLink() {
        malay.click();
        return this;
    }

    /**
     * Click on Maltese Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickMalteseLink() {
        maltese.click();
        return this;
    }

    /**
     * Click on Miejski Orodek Pomocy Rodzinie Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickMiejskiOrodekPomocyRodzinieLink() {
        miejskiOrodekPomocyRodzinie.click();
        return this;
    }

    /**
     * Click on Nazwa Malejco Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickNazwaMalejcoLink() {
        nazwaMalejco.click();
        return this;
    }

    /**
     * Click on Nazwa Miejscowoci Malejco Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickNazwaMiejscowociMalejcoLink() {
        nazwaMiejscowociMalejco.click();
        return this;
    }

    /**
     * Click on Nazwa Miejscowoci Rosnco Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickNazwaMiejscowociRosncoLink() {
        nazwaMiejscowociRosnco.click();
        return this;
    }

    /**
     * Click on Nazwa Rosnco Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickNazwaRosncoLink() {
        nazwaRosnco.click();
        return this;
    }

    /**
     * Click on Norwegian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickNorwegianLink() {
        norwegian.click();
        return this;
    }

    /**
     * Click on Openstreetmap Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickOpenstreetmapLink() {
        openstreetmap.click();
        return this;
    }

    /**
     * Click on Orodek Pomocy Spoecznej Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickOrodekPomocySpoecznejLink() {
        orodekPomocySpoecznej.click();
        return this;
    }

    /**
     * Click on Osoby Z Niepenosprawnoci Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickOsobyZNiepenosprawnociButton() {
        osobyZNiepenosprawnoci.click();
        return this;
    }

    /**
     * Click on Persian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPersianLink() {
        persian.click();
        return this;
    }

    /**
     * Click on Polish Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPolishLink() {
        polish.click();
        return this;
    }

    /**
     * Click on Polityka Cookies Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPolitykaCookiesLink() {
        politykaCookies.click();
        return this;
    }

    /**
     * Click on Poradnictwo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPoradnictwo10Link() {
        poradnictwo10.click();
        return this;
    }

    /**
     * Click on Poradnictwo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPoradnictwo12Link() {
        poradnictwo12.click();
        return this;
    }

    /**
     * Click on Poradnictwo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPoradnictwo14Link() {
        poradnictwo14.click();
        return this;
    }

    /**
     * Click on Poradnictwo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPoradnictwo16Link() {
        poradnictwo16.click();
        return this;
    }

    /**
     * Click on Poradnictwo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPoradnictwo1Link() {
        if (!poradnictwo1.isSelected()) {
            poradnictwo1.click();
        }
        return this;
    }

    /**
     * Click on Poradnictwo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPoradnictwo2Link() {
        poradnictwo2.click();
        return this;
    }

    /**
     * Click on Poradnictwo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPoradnictwo4Link() {
        poradnictwo4.click();
        return this;
    }

    /**
     * Click on Poradnictwo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPoradnictwo6Link() {
        poradnictwo6.click();
        return this;
    }

    /**
     * Click on Poradnictwo Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPoradnictwo8Link() {
        poradnictwo8.click();
        return this;
    }

    /**
     * Click on Portuguese Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPortugueseLink() {
        portuguese.click();
        return this;
    }

    /**
     * Click on Powiatowe Centrum Pomocy Rodzinie Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPowiatoweCentrumPomocyRodzinieLink() {
        powiatoweCentrumPomocyRodzinie.click();
        return this;
    }

    /**
     * Click on Przedsibiorstwo Spoeczne Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPrzedsibiorstwoSpoeczneLink() {
        przedsibiorstwoSpoeczne.click();
        return this;
    }

    /**
     * Click on Przemoc Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickPrzemocButton() {
        przemoc.click();
        return this;
    }

    /**
     * Click on Rejestr Jednostek Pomocy Spoecznej Rjps Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickRejestrJednostekPomocySpoecznejRjpsLink() {
        rejestrJednostekPomocySpoecznejRjps.click();
        return this;
    }

    /**
     * Click on Rodzina Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickRodzinaButton() {
        rodzina.click();
        return this;
    }

    /**
     * Click on Romanian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickRomanianLink() {
        romanian.click();
        return this;
    }

    /**
     * Click on Russian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickRussianLink() {
        russian.click();
        return this;
    }

    /**
     * Click on Seniorzy Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickSeniorzyButton() {
        seniorzy.click();
        return this;
    }

    /**
     * Click on Slovak Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickSlovakLink() {
        slovak.click();
        return this;
    }

    /**
     * Click on Slovenian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickSlovenianLink() {
        slovenian.click();
        return this;
    }

    /**
     * Click on Spanish Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickSpanishLink() {
        spanish.click();
        return this;
    }

    /**
     * Click on Swedish Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickSwedishLink() {
        swedish.click();
        return this;
    }

    /**
     * Click on Szukaj Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickSzukajButton() {
        szukaj.click();
        return this;
    }

    /**
     * Click on Thai Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickThaiLink() {
        thai.click();
        return this;
    }

    /**
     * Click on Trafno Najwiksza Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickTrafnoNajwikszaLink() {
        trafnoNajwiksza.click();
        return this;
    }

    /**
     * Click on Trudna Sytuacja Materialna Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickTrudnaSytuacjaMaterialnaButton() {
        trudnaSytuacjaMaterialna.click();
        return this;
    }

    /**
     * Click on Turkish Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickTurkishLink() {
        turkish.click();
        return this;
    }

    /**
     * Click on Typy Jednostek Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickTypyJednostekButton() {
        typyJednostek.click();
        return this;
    }

    /**
     * Click on Ukrainian Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUkrainianLink() {
        ukrainian.click();
        return this;
    }

    /**
     * Click on Urdu Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUrduLink() {
        urdu.click();
        return this;
    }

    /**
     * Click on Usugi Aktywizujce Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiAktywizujce10Link() {
        usugiAktywizujce10.click();
        return this;
    }

    /**
     * Click on Usugi Aktywizujce Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiAktywizujce12Link() {
        usugiAktywizujce12.click();
        return this;
    }

    /**
     * Click on Usugi Aktywizujce Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiAktywizujce14Link() {
        usugiAktywizujce14.click();
        return this;
    }

    /**
     * Click on Usugi Aktywizujce Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiAktywizujce16Link() {
        usugiAktywizujce16.click();
        return this;
    }

    /**
     * Click on Usugi Aktywizujce Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiAktywizujce1Link() {
        if (!usugiAktywizujce1.isSelected()) {
            usugiAktywizujce1.click();
        }
        return this;
    }

    /**
     * Click on Usugi Aktywizujce Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiAktywizujce2Link() {
        usugiAktywizujce2.click();
        return this;
    }

    /**
     * Click on Usugi Aktywizujce Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiAktywizujce4Link() {
        usugiAktywizujce4.click();
        return this;
    }

    /**
     * Click on Usugi Aktywizujce Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiAktywizujce6Link() {
        usugiAktywizujce6.click();
        return this;
    }

    /**
     * Click on Usugi Aktywizujce Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiAktywizujce8Link() {
        usugiAktywizujce8.click();
        return this;
    }

    /**
     * Click on Usugi Dzienne Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiDzienne10Link() {
        usugiDzienne10.click();
        return this;
    }

    /**
     * Click on Usugi Dzienne Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiDzienne12Link() {
        usugiDzienne12.click();
        return this;
    }

    /**
     * Click on Usugi Dzienne Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiDzienne14Link() {
        usugiDzienne14.click();
        return this;
    }

    /**
     * Click on Usugi Dzienne Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiDzienne16Link() {
        usugiDzienne16.click();
        return this;
    }

    /**
     * Click on Usugi Dzienne Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiDzienne1Link() {
        if (!usugiDzienne1.isSelected()) {
            usugiDzienne1.click();
        }
        return this;
    }

    /**
     * Click on Usugi Dzienne Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiDzienne2Link() {
        usugiDzienne2.click();
        return this;
    }

    /**
     * Click on Usugi Dzienne Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiDzienne4Link() {
        usugiDzienne4.click();
        return this;
    }

    /**
     * Click on Usugi Dzienne Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiDzienne6Link() {
        usugiDzienne6.click();
        return this;
    }

    /**
     * Click on Usugi Dzienne Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiDzienne8Link() {
        usugiDzienne8.click();
        return this;
    }

    /**
     * Click on Usugi Opiekucze Caodobowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiOpiekuczeCaodobowe10Link() {
        usugiOpiekuczeCaodobowe10.click();
        return this;
    }

    /**
     * Click on Usugi Opiekucze Caodobowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiOpiekuczeCaodobowe12Link() {
        usugiOpiekuczeCaodobowe12.click();
        return this;
    }

    /**
     * Click on Usugi Opiekucze Caodobowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiOpiekuczeCaodobowe14Link() {
        usugiOpiekuczeCaodobowe14.click();
        return this;
    }

    /**
     * Click on Usugi Opiekucze Caodobowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiOpiekuczeCaodobowe1Link() {
        if (!usugiOpiekuczeCaodobowe1.isSelected()) {
            usugiOpiekuczeCaodobowe1.click();
        }
        return this;
    }

    /**
     * Click on Usugi Opiekucze Caodobowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiOpiekuczeCaodobowe2Link() {
        usugiOpiekuczeCaodobowe2.click();
        return this;
    }

    /**
     * Click on Usugi Opiekucze Caodobowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiOpiekuczeCaodobowe4Link() {
        usugiOpiekuczeCaodobowe4.click();
        return this;
    }

    /**
     * Click on Usugi Opiekucze Caodobowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiOpiekuczeCaodobowe6Link() {
        usugiOpiekuczeCaodobowe6.click();
        return this;
    }

    /**
     * Click on Usugi Opiekucze Caodobowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUsugiOpiekuczeCaodobowe8Link() {
        usugiOpiekuczeCaodobowe8.click();
        return this;
    }

    /**
     * Click on Uzalenienia Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickUzalenieniaButton() {
        uzalenienia.click();
        return this;
    }

    /**
     * Click on Vietnamese Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickVietnameseLink() {
        vietnamese.click();
        return this;
    }

    /**
     * Click on Welsh Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWelshLink() {
        welsh.click();
        return this;
    }

    /**
     * Click on Wsparcie Finansowe I Rzeczowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWsparcieFinansoweIRzeczowe10Link() {
        wsparcieFinansoweIRzeczowe10.click();
        return this;
    }

    /**
     * Click on Wsparcie Finansowe I Rzeczowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWsparcieFinansoweIRzeczowe12Link() {
        wsparcieFinansoweIRzeczowe12.click();
        return this;
    }

    /**
     * Click on Wsparcie Finansowe I Rzeczowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWsparcieFinansoweIRzeczowe1Link() {
        if (!wsparcieFinansoweIRzeczowe1.isSelected()) {
            wsparcieFinansoweIRzeczowe1.click();
        }
        return this;
    }

    /**
     * Click on Wsparcie Finansowe I Rzeczowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWsparcieFinansoweIRzeczowe2Link() {
        wsparcieFinansoweIRzeczowe2.click();
        return this;
    }

    /**
     * Click on Wsparcie Finansowe I Rzeczowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWsparcieFinansoweIRzeczowe4Link() {
        wsparcieFinansoweIRzeczowe4.click();
        return this;
    }

    /**
     * Click on Wsparcie Finansowe I Rzeczowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWsparcieFinansoweIRzeczowe6Link() {
        wsparcieFinansoweIRzeczowe6.click();
        return this;
    }

    /**
     * Click on Wsparcie Finansowe I Rzeczowe Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWsparcieFinansoweIRzeczowe8Link() {
        wsparcieFinansoweIRzeczowe8.click();
        return this;
    }

    /**
     * Click on Wszystkie Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWszystkie1Button() {
        wszystkie1.click();
        return this;
    }

    /**
     * Click on Wszystkie Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWszystkie2Button() {
        wszystkie2.click();
        return this;
    }

    /**
     * Click on Wszystkie Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWszystkie3Button() {
        wszystkie3.click();
        return this;
    }

    /**
     * Click on Wszystkie Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWszystkie4Button() {
        wszystkie4.click();
        return this;
    }

    /**
     * Click on Wszystkie Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWszystkie5Button() {
        wszystkie5.click();
        return this;
    }

    /**
     * Click on Wszystkie Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWszystkie6Button() {
        wszystkie6.click();
        return this;
    }

    /**
     * Click on Wszystkie Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWszystkie7Button() {
        wszystkie7.click();
        return this;
    }

    /**
     * Click on Wszystkie Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWszystkie8Button() {
        wszystkie8.click();
        return this;
    }

    /**
     * Click on Wyczy Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWyczy1Button() {
        wyczy1.click();
        return this;
    }

    /**
     * Click on Wyczy Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWyczy2Button() {
        wyczy2.click();
        return this;
    }

    /**
     * Click on Wyczy Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWyczy3Button() {
        wyczy3.click();
        return this;
    }

    /**
     * Click on Wyczy Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWyczy4Button() {
        wyczy4.click();
        return this;
    }

    /**
     * Click on Wyczy Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWyczy5Button() {
        wyczy5.click();
        return this;
    }

    /**
     * Click on Wyczy Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWyczy6Button() {
        wyczy6.click();
        return this;
    }

    /**
     * Click on Wyczy Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWyczy7Button() {
        wyczy7.click();
        return this;
    }

    /**
     * Click on Wyczy Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWyczy8Button() {
        wyczy8.click();
        return this;
    }

    /**
     * Click on Wyczy Filtry Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWyczyFiltryLink() {
        wyczyFiltry.click();
        return this;
    }

    /**
     * Click on Wyszukiwanie Szczegowe Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickWyszukiwanieSzczegoweButton() {
        wyszukiwanieSzczegowe.click();
        return this;
    }

    /**
     * Click on Zapamitane Jednostki Link.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickZapamitaneJednostkiLink() {
        zapamitaneJednostki.click();
        return this;
    }

    /**
     * Click on Zastosuj Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickZastosuj1Button() {
        zastosuj1.click();
        return this;
    }

    /**
     * Click on Zastosuj Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickZastosuj2Button() {
        zastosuj2.click();
        return this;
    }

    /**
     * Click on Zastosuj Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickZastosuj3Button() {
        zastosuj3.click();
        return this;
    }

    /**
     * Click on Zastosuj Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickZastosuj4Button() {
        zastosuj4.click();
        return this;
    }

    /**
     * Click on Zastosuj Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickZastosuj5Button() {
        zastosuj5.click();
        return this;
    }

    /**
     * Click on Zastosuj Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickZastosuj6Button() {
        zastosuj6.click();
        return this;
    }

    /**
     * Click on Zastosuj Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickZastosuj7Button() {
        zastosuj7.click();
        return this;
    }

    /**
     * Click on Zastosuj Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickZastosuj8Button() {
        zastosuj8.click();
        return this;
    }

    /**
     * Click on Zdrowie Button.
     *
     * @return the pages.Maps class instance.
     */
    public Maps clickZdrowieButton() {
        zdrowie.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the pages.Maps class instance.
     */
    public Maps fill() {
        setJakiejPomocySzukaszTextField();
        setWpiszMiejscowoTextField();
        setWybierzOdlego2TextField();
        setPozycjiNaStronieTextField();
        setSortowanieTextField();
        clickUsugiOpiekuczeCaodobowe1Link();
        clickUsugiDzienne1Link();
        clickUsugiAktywizujce1Link();
        clickPoradnictwo1Link();
        clickGrupyWsparcia1Link();
        clickWsparcieFinansoweIRzeczowe1Link();
        setUsugiOpiekuczeCaodobowe3CheckboxField();
        setUsugiDzienne3CheckboxField();
        setUsugiAktywizujce3CheckboxField();
        setPoradnictwo3CheckboxField();
        setGrupyWsparcia3CheckboxField();
        setWsparcieFinansoweIRzeczowe3CheckboxField();
        setUsugiOpiekuczeCaodobowe5CheckboxField();
        setUsugiDzienne5CheckboxField();
        setUsugiAktywizujce5CheckboxField();
        setPoradnictwo5CheckboxField();
        setGrupyWsparcia5CheckboxField();
        setWsparcieFinansoweIRzeczowe5CheckboxField();
        setUsugiOpiekuczeCaodobowe7CheckboxField();
        setUsugiDzienne7CheckboxField();
        setUsugiAktywizujce7CheckboxField();
        setPoradnictwo7CheckboxField();
        setGrupyWsparcia7CheckboxField();
        setWsparcieFinansoweIRzeczowe7CheckboxField();
        setUsugiDzienne9CheckboxField();
        setUsugiAktywizujce9CheckboxField();
        setPoradnictwo9CheckboxField();
        setGrupyWsparcia9CheckboxField();
        setUsugiOpiekuczeCaodobowe9CheckboxField();
        setUsugiDzienne11CheckboxField();
        setUsugiAktywizujce11CheckboxField();
        setPoradnictwo11CheckboxField();
        setGrupyWsparcia11CheckboxField();
        setWsparcieFinansoweIRzeczowe9CheckboxField();
        setUsugiOpiekuczeCaodobowe11CheckboxField();
        setUsugiDzienne13CheckboxField();
        setUsugiAktywizujce13CheckboxField();
        setPoradnictwo13CheckboxField();
        setGrupyWsparcia13CheckboxField();
        setUsugiOpiekuczeCaodobowe13CheckboxField();
        setUsugiDzienne15CheckboxField();
        setUsugiAktywizujce15CheckboxField();
        setPoradnictwo15CheckboxField();
        setGrupyWsparcia15CheckboxField();
        setWsparcieFinansoweIRzeczowe11CheckboxField();
        setWsparcieFinansoweIRzeczowe13TextareaField();
        setEnglishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese1TextField();
        setEnglishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese2TextField();
        setTranslateWithCopyTheUrlBelowTextField();
        setEnableCollaborativeFeaturesAndCustomizeWidgetTextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the pages.Maps class instance.
     */
    public Maps fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Enable Collaborative Features And Customize Widget Bing Webmaster Portal Back Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setEnableCollaborativeFeaturesAndCustomizeWidgetTextField() {
        return setEnableCollaborativeFeaturesAndCustomizeWidgetTextField(data.get("ENABLE_COLLABORATIVE_FEATURES_AND_CUSTOMIZE_WIDGET"));
    }

    /**
     * Set value to Enable Collaborative Features And Customize Widget Bing Webmaster Portal Back Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setEnableCollaborativeFeaturesAndCustomizeWidgetTextField(String enableCollaborativeFeaturesAndCustomizeWidgetValue) {
        enableCollaborativeFeaturesAndCustomizeWidget.sendKeys(enableCollaborativeFeaturesAndCustomizeWidgetValue);
        return this;
    }

    /**
     * Set default value to English Arabichebrewpolish Bulgarianhindiportuguese Catalanhmong Dawromanian Chinese Simplifiedhungarianrussian Chinese Traditionalindonesianslovak Czechitalianslovenian Danishjapanesespanish Dutchklingonswedish Englishkoreanthai Estonianlatvianturkish Finnishlithuanianukrainian Frenchmalayurdu Germanmaltesevietnamese Greeknorwegianwelsh Haitian Creolepersian Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setEnglishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese1TextField() {
        return setEnglishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese1TextField(data.get("ENGLISH_ARABICHEBREWPOLISH_BULGARIANHINDIPORTUGUESE_CATALANHMONG_DAWROMANIAN_CHINESE_1"));
    }

    /**
     * Set value to English Arabichebrewpolish Bulgarianhindiportuguese Catalanhmong Dawromanian Chinese Simplifiedhungarianrussian Chinese Traditionalindonesianslovak Czechitalianslovenian Danishjapanesespanish Dutchklingonswedish Englishkoreanthai Estonianlatvianturkish Finnishlithuanianukrainian Frenchmalayurdu Germanmaltesevietnamese Greeknorwegianwelsh Haitian Creolepersian Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setEnglishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese1TextField(String englishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese1Value) {
        englishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese1.sendKeys(englishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese1Value);
        return this;
    }

    /**
     * Set default value to English Arabichebrewpolish Bulgarianhindiportuguese Catalanhmong Dawromanian Chinese Simplifiedhungarianrussian Chinese Traditionalindonesianslovak Czechitalianslovenian Danishjapanesespanish Dutchklingonswedish Englishkoreanthai Estonianlatvianturkish Finnishlithuanianukrainian Frenchmalayurdu Germanmaltesevietnamese Greeknorwegianwelsh Haitian Creolepersian Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setEnglishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese2TextField() {
        return setEnglishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese2TextField(data.get("ENGLISH_ARABICHEBREWPOLISH_BULGARIANHINDIPORTUGUESE_CATALANHMONG_DAWROMANIAN_CHINESE_2"));
    }

    /**
     * Set value to English Arabichebrewpolish Bulgarianhindiportuguese Catalanhmong Dawromanian Chinese Simplifiedhungarianrussian Chinese Traditionalindonesianslovak Czechitalianslovenian Danishjapanesespanish Dutchklingonswedish Englishkoreanthai Estonianlatvianturkish Finnishlithuanianukrainian Frenchmalayurdu Germanmaltesevietnamese Greeknorwegianwelsh Haitian Creolepersian Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setEnglishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese2TextField(String englishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese2Value) {
        englishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese2.sendKeys(englishArabichebrewpolishBulgarianhindiportugueseCatalanhmongDawromanianChinese2Value);
        return this;
    }

    /**
     * Set Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setGrupyWsparcia11CheckboxField() {
        if (!grupyWsparcia11.isSelected()) {
            grupyWsparcia11.click();
        }
        return this;
    }

    /**
     * Set Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setGrupyWsparcia13CheckboxField() {
        if (!grupyWsparcia13.isSelected()) {
            grupyWsparcia13.click();
        }
        return this;
    }

    /**
     * Set Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setGrupyWsparcia15CheckboxField() {
        if (!grupyWsparcia15.isSelected()) {
            grupyWsparcia15.click();
        }
        return this;
    }

    /**
     * Set Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setGrupyWsparcia3CheckboxField() {
        if (!grupyWsparcia3.isSelected()) {
            grupyWsparcia3.click();
        }
        return this;
    }

    /**
     * Set Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setGrupyWsparcia5CheckboxField() {
        if (!grupyWsparcia5.isSelected()) {
            grupyWsparcia5.click();
        }
        return this;
    }

    /**
     * Set Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setGrupyWsparcia7CheckboxField() {
        if (!grupyWsparcia7.isSelected()) {
            grupyWsparcia7.click();
        }
        return this;
    }

    /**
     * Set Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setGrupyWsparcia9CheckboxField() {
        if (!grupyWsparcia9.isSelected()) {
            grupyWsparcia9.click();
        }
        return this;
    }

    /**
     * Set default value to Jakiej Pomocy Szukasz Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setJakiejPomocySzukaszTextField() {
        return setJakiejPomocySzukaszTextField(data.get("JAKIEJ_POMOCY_SZUKASZ"));
    }

    /**
     * Set value to Jakiej Pomocy Szukasz Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setJakiejPomocySzukaszTextField(String jakiejPomocySzukaszValue) {
        jakiejPomocySzukasz.sendKeys(jakiejPomocySzukaszValue);
        return this;
    }

    /**
     * Set Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setPoradnictwo11CheckboxField() {
        if (!poradnictwo11.isSelected()) {
            poradnictwo11.click();
        }
        return this;
    }

    /**
     * Set Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setPoradnictwo13CheckboxField() {
        if (!poradnictwo13.isSelected()) {
            poradnictwo13.click();
        }
        return this;
    }

    /**
     * Set Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setPoradnictwo15CheckboxField() {
        if (!poradnictwo15.isSelected()) {
            poradnictwo15.click();
        }
        return this;
    }

    /**
     * Set Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setPoradnictwo3CheckboxField() {
        if (!poradnictwo3.isSelected()) {
            poradnictwo3.click();
        }
        return this;
    }

    /**
     * Set Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setPoradnictwo5CheckboxField() {
        if (!poradnictwo5.isSelected()) {
            poradnictwo5.click();
        }
        return this;
    }

    /**
     * Set Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setPoradnictwo7CheckboxField() {
        if (!poradnictwo7.isSelected()) {
            poradnictwo7.click();
        }
        return this;
    }

    /**
     * Set Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setPoradnictwo9CheckboxField() {
        if (!poradnictwo9.isSelected()) {
            poradnictwo9.click();
        }
        return this;
    }

    /**
     * Set default value to Pozycji Na Stronie Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setPozycjiNaStronieTextField() {
        return setPozycjiNaStronieTextField(data.get("POZYCJI_NA_STRONIE"));
    }

    /**
     * Set value to Pozycji Na Stronie Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setPozycjiNaStronieTextField(String pozycjiNaStronieValue) {
        pozycjiNaStronie.sendKeys(pozycjiNaStronieValue);
        return this;
    }

    /**
     * Set default value to Sortowanie Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setSortowanieTextField() {
        return setSortowanieTextField(data.get("SORTOWANIE"));
    }

    /**
     * Set value to Sortowanie Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setSortowanieTextField(String sortowanieValue) {
        sortowanie.sendKeys(sortowanieValue);
        return this;
    }

    /**
     * Set default value to Translate With Copy The Url Below Back Embed The Snippet Below In Your Site Enable Collaborative Features And Customize Widget Bing Webmaster Portal Back Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setTranslateWithCopyTheUrlBelowTextField() {
        return setTranslateWithCopyTheUrlBelowTextField(data.get("TRANSLATE_WITH_COPY_THE_URL_BELOW"));
    }

    /**
     * Set value to Translate With Copy The Url Below Back Embed The Snippet Below In Your Site Enable Collaborative Features And Customize Widget Bing Webmaster Portal Back Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setTranslateWithCopyTheUrlBelowTextField(String translateWithCopyTheUrlBelowValue) {
        translateWithCopyTheUrlBelow.sendKeys(translateWithCopyTheUrlBelowValue);
        return this;
    }

    /**
     * Set Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiAktywizujce11CheckboxField() {
        if (!usugiAktywizujce11.isSelected()) {
            usugiAktywizujce11.click();
        }
        return this;
    }

    /**
     * Set Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiAktywizujce13CheckboxField() {
        if (!usugiAktywizujce13.isSelected()) {
            usugiAktywizujce13.click();
        }
        return this;
    }

    /**
     * Set Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiAktywizujce15CheckboxField() {
        if (!usugiAktywizujce15.isSelected()) {
            usugiAktywizujce15.click();
        }
        return this;
    }

    /**
     * Set Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiAktywizujce3CheckboxField() {
        if (!usugiAktywizujce3.isSelected()) {
            usugiAktywizujce3.click();
        }
        return this;
    }

    /**
     * Set Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiAktywizujce5CheckboxField() {
        if (!usugiAktywizujce5.isSelected()) {
            usugiAktywizujce5.click();
        }
        return this;
    }

    /**
     * Set Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiAktywizujce7CheckboxField() {
        if (!usugiAktywizujce7.isSelected()) {
            usugiAktywizujce7.click();
        }
        return this;
    }

    /**
     * Set Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiAktywizujce9CheckboxField() {
        if (!usugiAktywizujce9.isSelected()) {
            usugiAktywizujce9.click();
        }
        return this;
    }

    /**
     * Set Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiDzienne11CheckboxField() {
        if (!usugiDzienne11.isSelected()) {
            usugiDzienne11.click();
        }
        return this;
    }

    /**
     * Set Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiDzienne13CheckboxField() {
        if (!usugiDzienne13.isSelected()) {
            usugiDzienne13.click();
        }
        return this;
    }

    /**
     * Set Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiDzienne15CheckboxField() {
        if (!usugiDzienne15.isSelected()) {
            usugiDzienne15.click();
        }
        return this;
    }

    /**
     * Set Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiDzienne3CheckboxField() {
        if (!usugiDzienne3.isSelected()) {
            usugiDzienne3.click();
        }
        return this;
    }

    /**
     * Set Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiDzienne5CheckboxField() {
        if (!usugiDzienne5.isSelected()) {
            usugiDzienne5.click();
        }
        return this;
    }

    /**
     * Set Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiDzienne7CheckboxField() {
        if (!usugiDzienne7.isSelected()) {
            usugiDzienne7.click();
        }
        return this;
    }

    /**
     * Set Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiDzienne9CheckboxField() {
        if (!usugiDzienne9.isSelected()) {
            usugiDzienne9.click();
        }
        return this;
    }

    /**
     * Set Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiOpiekuczeCaodobowe11CheckboxField() {
        if (!usugiOpiekuczeCaodobowe11.isSelected()) {
            usugiOpiekuczeCaodobowe11.click();
        }
        return this;
    }

    /**
     * Set Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiOpiekuczeCaodobowe13CheckboxField() {
        if (!usugiOpiekuczeCaodobowe13.isSelected()) {
            usugiOpiekuczeCaodobowe13.click();
        }
        return this;
    }

    /**
     * Set Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiOpiekuczeCaodobowe3CheckboxField() {
        if (!usugiOpiekuczeCaodobowe3.isSelected()) {
            usugiOpiekuczeCaodobowe3.click();
        }
        return this;
    }

    /**
     * Set Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiOpiekuczeCaodobowe5CheckboxField() {
        if (!usugiOpiekuczeCaodobowe5.isSelected()) {
            usugiOpiekuczeCaodobowe5.click();
        }
        return this;
    }

    /**
     * Set Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiOpiekuczeCaodobowe7CheckboxField() {
        if (!usugiOpiekuczeCaodobowe7.isSelected()) {
            usugiOpiekuczeCaodobowe7.click();
        }
        return this;
    }

    /**
     * Set Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setUsugiOpiekuczeCaodobowe9CheckboxField() {
        if (!usugiOpiekuczeCaodobowe9.isSelected()) {
            usugiOpiekuczeCaodobowe9.click();
        }
        return this;
    }

    /**
     * Set default value to Wpisz Miejscowo Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWpiszMiejscowoTextField() {
        return setWpiszMiejscowoTextField(data.get("WPISZ_MIEJSCOWO"));
    }

    /**
     * Set value to Wpisz Miejscowo Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWpiszMiejscowoTextField(String wpiszMiejscowoValue) {
        wpiszMiejscowo.sendKeys(wpiszMiejscowoValue);
        return this;
    }

    /**
     * Set Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWsparcieFinansoweIRzeczowe11CheckboxField() {
        if (!wsparcieFinansoweIRzeczowe11.isSelected()) {
            wsparcieFinansoweIRzeczowe11.click();
        }
        return this;
    }

    /**
     * Set default value to Wsparcie Finansowe I Rzeczowe Textarea field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWsparcieFinansoweIRzeczowe13TextareaField() {
        return setWsparcieFinansoweIRzeczowe13TextareaField(data.get("WSPARCIE_FINANSOWE_I_RZECZOWE_13"));
    }

    /**
     * Set value to Wsparcie Finansowe I Rzeczowe Textarea field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWsparcieFinansoweIRzeczowe13TextareaField(String wsparcieFinansoweIRzeczowe13Value) {
        wsparcieFinansoweIRzeczowe13.sendKeys(wsparcieFinansoweIRzeczowe13Value);
        return this;
    }

    /**
     * Set Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWsparcieFinansoweIRzeczowe3CheckboxField() {
        if (!wsparcieFinansoweIRzeczowe3.isSelected()) {
            wsparcieFinansoweIRzeczowe3.click();
        }
        return this;
    }

    /**
     * Set Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWsparcieFinansoweIRzeczowe5CheckboxField() {
        if (!wsparcieFinansoweIRzeczowe5.isSelected()) {
            wsparcieFinansoweIRzeczowe5.click();
        }
        return this;
    }

    /**
     * Set Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWsparcieFinansoweIRzeczowe7CheckboxField() {
        if (!wsparcieFinansoweIRzeczowe7.isSelected()) {
            wsparcieFinansoweIRzeczowe7.click();
        }
        return this;
    }

    /**
     * Set Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWsparcieFinansoweIRzeczowe9CheckboxField() {
        if (!wsparcieFinansoweIRzeczowe9.isSelected()) {
            wsparcieFinansoweIRzeczowe9.click();
        }
        return this;
    }

    /**
     * Set default value to Wybierz Odlego Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWybierzOdlego1TextField() {
        return setWybierzOdlego1TextField(data.get("WYBIERZ_ODLEGO_1"));
    }

    /**
     * Set value to Wybierz Odlego Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWybierzOdlego1TextField(String wybierzOdlego1Value) {
        wybierzOdlego1.click();
        return this;
    }

    /**
     * Set default value to Wybierz Odlego Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWybierzOdlego2TextField() {
        return setWybierzOdlego2TextField(data.get("WYBIERZ_ODLEGO_2"));
    }

    /**
     * Set value to Wybierz Odlego Text field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps setWybierzOdlego2TextField(String wybierzOdlego2Value) {
        wybierzOdlego2.sendKeys(wybierzOdlego2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the pages.Maps class instance.
     */
    public Maps submit() {
        clickSzukajButton();
        return this;
    }

    /**
     * Unset Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetGrupyWsparcia11CheckboxField() {
        if (grupyWsparcia11.isSelected()) {
            grupyWsparcia11.click();
        }
        return this;
    }

    /**
     * Unset Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetGrupyWsparcia13CheckboxField() {
        if (grupyWsparcia13.isSelected()) {
            grupyWsparcia13.click();
        }
        return this;
    }

    /**
     * Unset Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetGrupyWsparcia15CheckboxField() {
        if (grupyWsparcia15.isSelected()) {
            grupyWsparcia15.click();
        }
        return this;
    }

    /**
     * Unset Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetGrupyWsparcia3CheckboxField() {
        if (grupyWsparcia3.isSelected()) {
            grupyWsparcia3.click();
        }
        return this;
    }

    /**
     * Unset Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetGrupyWsparcia5CheckboxField() {
        if (grupyWsparcia5.isSelected()) {
            grupyWsparcia5.click();
        }
        return this;
    }

    /**
     * Unset Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetGrupyWsparcia7CheckboxField() {
        if (grupyWsparcia7.isSelected()) {
            grupyWsparcia7.click();
        }
        return this;
    }

    /**
     * Unset Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetGrupyWsparcia9CheckboxField() {
        if (grupyWsparcia9.isSelected()) {
            grupyWsparcia9.click();
        }
        return this;
    }

    /**
     * Unset Grupy Wsparcia Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
//    public pages.Maps unsetGrupyWsparciaCheckboxField() {
//        if (grupyWsparcia.isSelected()) {
//            grupyWsparcia.click();
//        }
//        return this;
//    }

    /**
     * Unset Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetPoradnictwo11CheckboxField() {
        if (poradnictwo11.isSelected()) {
            poradnictwo11.click();
        }
        return this;
    }

    /**
     * Unset Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetPoradnictwo13CheckboxField() {
        if (poradnictwo13.isSelected()) {
            poradnictwo13.click();
        }
        return this;
    }

    /**
     * Unset Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetPoradnictwo15CheckboxField() {
        if (poradnictwo15.isSelected()) {
            poradnictwo15.click();
        }
        return this;
    }

    /**
     * Unset Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetPoradnictwo3CheckboxField() {
        if (poradnictwo3.isSelected()) {
            poradnictwo3.click();
        }
        return this;
    }

    /**
     * Unset Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetPoradnictwo5CheckboxField() {
        if (poradnictwo5.isSelected()) {
            poradnictwo5.click();
        }
        return this;
    }

    /**
     * Unset Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetPoradnictwo7CheckboxField() {
        if (poradnictwo7.isSelected()) {
            poradnictwo7.click();
        }
        return this;
    }

    /**
     * Unset Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetPoradnictwo9CheckboxField() {
        if (poradnictwo9.isSelected()) {
            poradnictwo9.click();
        }
        return this;
    }

    /**
     * Unset Poradnictwo Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
//    public pages.Maps unsetPoradnictwoCheckboxField() {
//        if (poradnictwo.isSelected()) {
//            poradnictwo.click();
//        }
//        return this;
//    }

    /**
     * Unset Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiAktywizujce11CheckboxField() {
        if (usugiAktywizujce11.isSelected()) {
            usugiAktywizujce11.click();
        }
        return this;
    }

    /**
     * Unset Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiAktywizujce13CheckboxField() {
        if (usugiAktywizujce13.isSelected()) {
            usugiAktywizujce13.click();
        }
        return this;
    }

    /**
     * Unset Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiAktywizujce15CheckboxField() {
        if (usugiAktywizujce15.isSelected()) {
            usugiAktywizujce15.click();
        }
        return this;
    }

    /**
     * Unset Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiAktywizujce3CheckboxField() {
        if (usugiAktywizujce3.isSelected()) {
            usugiAktywizujce3.click();
        }
        return this;
    }

    /**
     * Unset Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiAktywizujce5CheckboxField() {
        if (usugiAktywizujce5.isSelected()) {
            usugiAktywizujce5.click();
        }
        return this;
    }

    /**
     * Unset Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiAktywizujce7CheckboxField() {
        if (usugiAktywizujce7.isSelected()) {
            usugiAktywizujce7.click();
        }
        return this;
    }

    /**
     * Unset Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiAktywizujce9CheckboxField() {
        if (usugiAktywizujce9.isSelected()) {
            usugiAktywizujce9.click();
        }
        return this;
    }

    /**
     * Unset Usugi Aktywizujce Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
//    public pages.Maps unsetUsugiAktywizujceCheckboxField() {
//        if (usugiAktywizujce.isSelected()) {
//            usugiAktywizujce.click();
//        }
//        return this;
//    }

    /**
     * Unset Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiDzienne11CheckboxField() {
        if (usugiDzienne11.isSelected()) {
            usugiDzienne11.click();
        }
        return this;
    }

    /**
     * Unset Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiDzienne13CheckboxField() {
        if (usugiDzienne13.isSelected()) {
            usugiDzienne13.click();
        }
        return this;
    }

    /**
     * Unset Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiDzienne15CheckboxField() {
        if (usugiDzienne15.isSelected()) {
            usugiDzienne15.click();
        }
        return this;
    }

    /**
     * Unset Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiDzienne3CheckboxField() {
        if (usugiDzienne3.isSelected()) {
            usugiDzienne3.click();
        }
        return this;
    }

    /**
     * Unset Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiDzienne5CheckboxField() {
        if (usugiDzienne5.isSelected()) {
            usugiDzienne5.click();
        }
        return this;
    }

    /**
     * Unset Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiDzienne7CheckboxField() {
        if (usugiDzienne7.isSelected()) {
            usugiDzienne7.click();
        }
        return this;
    }

    /**
     * Unset Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiDzienne9CheckboxField() {
        if (usugiDzienne9.isSelected()) {
            usugiDzienne9.click();
        }
        return this;
    }

    /**
     * Unset Usugi Dzienne Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
//    public pages.Maps unsetUsugiDzienneCheckboxField() {
//        if (usugiDzienne.isSelected()) {
//            usugiDzienne.click();
//        }
//        return this;
//    }

    /**
     * Unset Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiOpiekuczeCaodobowe11CheckboxField() {
        if (usugiOpiekuczeCaodobowe11.isSelected()) {
            usugiOpiekuczeCaodobowe11.click();
        }
        return this;
    }

    /**
     * Unset Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiOpiekuczeCaodobowe13CheckboxField() {
        if (usugiOpiekuczeCaodobowe13.isSelected()) {
            usugiOpiekuczeCaodobowe13.click();
        }
        return this;
    }

    /**
     * Unset Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiOpiekuczeCaodobowe3CheckboxField() {
        if (usugiOpiekuczeCaodobowe3.isSelected()) {
            usugiOpiekuczeCaodobowe3.click();
        }
        return this;
    }

    /**
     * Unset Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiOpiekuczeCaodobowe5CheckboxField() {
        if (usugiOpiekuczeCaodobowe5.isSelected()) {
            usugiOpiekuczeCaodobowe5.click();
        }
        return this;
    }

    /**
     * Unset Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiOpiekuczeCaodobowe7CheckboxField() {
        if (usugiOpiekuczeCaodobowe7.isSelected()) {
            usugiOpiekuczeCaodobowe7.click();
        }
        return this;
    }

    /**
     * Unset Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetUsugiOpiekuczeCaodobowe9CheckboxField() {
        if (usugiOpiekuczeCaodobowe9.isSelected()) {
            usugiOpiekuczeCaodobowe9.click();
        }
        return this;
    }

    /**
     * Unset Usugi Opiekucze Caodobowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */


    /**
     * Unset Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetWsparcieFinansoweIRzeczowe11CheckboxField() {
        if (wsparcieFinansoweIRzeczowe11.isSelected()) {
            wsparcieFinansoweIRzeczowe11.click();
        }
        return this;
    }

    /**
     * Unset Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetWsparcieFinansoweIRzeczowe3CheckboxField() {
        if (wsparcieFinansoweIRzeczowe3.isSelected()) {
            wsparcieFinansoweIRzeczowe3.click();
        }
        return this;
    }

    /**
     * Unset Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetWsparcieFinansoweIRzeczowe5CheckboxField() {
        if (wsparcieFinansoweIRzeczowe5.isSelected()) {
            wsparcieFinansoweIRzeczowe5.click();
        }
        return this;
    }

    /**
     * Unset Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetWsparcieFinansoweIRzeczowe7CheckboxField() {
        if (wsparcieFinansoweIRzeczowe7.isSelected()) {
            wsparcieFinansoweIRzeczowe7.click();
        }
        return this;
    }

    /**
     * Unset Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */
    public Maps unsetWsparcieFinansoweIRzeczowe9CheckboxField() {
        if (wsparcieFinansoweIRzeczowe9.isSelected()) {
            wsparcieFinansoweIRzeczowe9.click();
        }
        return this;
    }

    /**
     * Unset Wsparcie Finansowe I Rzeczowe Checkbox field.
     *
     * @return the pages.Maps class instance.
     */


    /**
     * Verify that the page loaded completely.
     *
     * @return the pages.Maps class instance.
     */
    public Maps verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the pages.Maps class instance.
     */
    public Maps verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
