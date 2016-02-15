package com.hongdazeng;

/**
 * Created by Hongda Zeng on 2/15/2016.
 *
 */
public class FactorialTable {

    String[] facTable = {"1", "1", "2", "6", "24", "120", "720", "5040", "40320", "362880", "3628800", "39916800",
            "479001600", "6227020800", "87178291200", "1307674368000", "20922789888000", "355687428096000",
            "6402373705728000", "121645100408832000", "2432902008176640000", "51090942171709440000",
            "1124000727777607680000", "25852016738884976640000", "620448401733239439360000",
            "15511210043330985984000000", "403291461126605635584000000", "10888869450418352160768000000",
            "304888344611713860501504000000", "8841761993739701954543616000000",
            "265252859812191058636308480000000", "8222838654177922817725562880000000",
            "263130836933693530167218012160000000", "8683317618811886495518194401280000000",
            "295232799039604140847618609643520000000", "10333147966386144929666651337523200000000",
            "371993326789901217467999448150835200000000", "13763753091226345046315979581580902400000000",
            "523022617466601111760007224100074291200000000", "20397882081197443358640281739902897356800000000",
            "815915283247897734345611269596115894272000000000",
            "33452526613163807108170062053440751665152000000000",
            "1405006117752879898543142606244511569936384000000000",
            "60415263063373835637355132068513997507264512000000000",
            "2658271574788448768043625811014615890319638528000000000",
            "119622220865480194561963161495657715064383733760000000000",
            "5502622159812088949850305428800254892961651752960000000000",
            "258623241511168180642964355153611979969197632389120000000000",
            "12413915592536072670862289047373375038521486354677760000000000",
            "608281864034267560872252163321295376887552831379210240000000000",
            "30414093201713378043612608166064768844377641568960512000000000000",
            "1551118753287382280224243016469303211063259720016986112000000000000",
            "80658175170943878571660636856403766975289505440883277824000000000000",
            "4274883284060025564298013753389399649690343788366813724672000000000000",
            "230843697339241380472092742683027581083278564571807941132288000000000000",
            "12696403353658275925965100847566516959580321051449436762275840000000000000",
            "710998587804863451854045647463724949736497978881168458687447040000000000000",
            "40526919504877216755680601905432322134980384796226602145184481280000000000000",
            "2350561331282878571829474910515074683828862318181142924420699914240000000000000",
            "138683118545689835737939019720389406345902876772687432540821294940160000000000000",
            "8320987112741390144276341183223364380754172606361245952449277696409600000000000000",
            "507580213877224798800856812176625227226004528988036003099405939480985600000000000000",
            "31469973260387937525653122354950764088012280797258232192163168247821107200000000000000",
            "1982608315404440064116146708361898137544773690227268628106279599612729753600000000000000",
            "126886932185884164103433389335161480802865516174545192198801894375214704230400000000000000",
            "8247650592082470666723170306785496252186258551345437492922123134388955774976000000000000000",
            "544344939077443064003729240247842752644293064388798874532860126869671081148416000000000000000",
            "36471110918188685288249859096605464427167635314049524593701628500267962436943872000000000000000",
            "2480035542436830599600990418569171581047399201355367672371710738018221445712183296000000000000000",
            "171122452428141311372468338881272839092270544893520369393648040923257279754140647424000000000000000",
            "11978571669969891796072783721689098736458938142546425857555362864628009582789845319680000000000000000",
            "8504785885678623175211676442399260102885846081207962358864307633885886803780790176972800000000000000" +
                    "00", "612344583768860868615240703852746727407780917846973289838230149639783849872216892742041" +
            "60000000000000000", "44701154615126843408912571381250511100768007002829050158190800923704221040671833" +
            "17016903680000000000000000", "33078854415193864122595302822125378214568325182093497117061192683541123" +
            "5700971565459250872320000000000000000", "248091408113953980919464771165940336609262438865701228377958" +
            "94512655842677572867409443815424000000000000000000", "18854947016660502549879322608611465582303945353" +
            "79329335672487982961844043495537923117729972224000000000000000000", "14518309202828586963407078408630" +
            "8284983740379224208358846781574688061991349156420080065207861248000000000000000000", "113242811782062" +
            "9783145752115873204622873174957948825199004896282566883532523420076624508621317734400000000000000000" +
            "0", "894618213078297528685144171539831652069808216779571907213868063227837990693501860533361810841010" +
            "176000000000000000000", "7156945704626380229481153372318653216558465734236575257710944505822703925548" +
            "0148842668944867280814080000000000000000000", "579712602074736798587973423157810910541235724473162595" +
            "8745865049716390179693892056256184534249745940480000000000000000000", "475364333701284174842138206989" +
            "404946643813294067993328617160934076743994734899148613007131808479167119360000000000000000000", "3945" +
            "5239697206586511897471180120610571436503407643446275224357528369751562996629334879591940103770870906" +
            "880000000000000000000", "3314240134565353266999387579130131288000666286242049487118846032383059131291" +
            "716864129885722968716753156177920000000000000000000", "2817104114380550276949479442260611594800566343" +
            "30574206405101912752560026159795933451040286452340924018275123200000000000000000000", "24227095383672" +
            "7323817655232034412597152848705524293817508387644967201622497424502767894646349013194655716605952000" +
            "00000000000000000", "21077572983795277172136005186993895952297837380613562123229725112146541157275931" +
            "74080683423236414793504734471782400000000000000000000", "18548264225739843911479684564554628438022096" +
            "8949399346684421580986889562184028199319100141244804501828416633516851200000000000000000000", "165079" +
            "5516090846108121691926245361930983966623649654185491352070783317103437850973939991257078760066272908" +
            "0382999756800000000000000000000", "148571596448176149730952273362082573788556996128468876694221686370" +
            "4985393094065876545992131370884059645617234469978112000000000000000000000", "135200152767840296255166" +
            "5687594951421475868664769066777917417345971536707715599947656852839547504494277511683367680081920000" +
            "00000000000000000", "12438414054641307255475324325873553077577991715875414356840239582938137710983519" +
            "518443046123837041347353107486982656753664000000000000000000000", "1156772507081641574759205162306240" +
            "4362147532295764135351861422812132468071214673152152032895168448453038389962893870780907520000000000" +
            "00000000000", "10873661566567430802736528525678660100418680358018287230749737443404519986941792763022" +
            "9109214583415458560865651202385340530688000000000000000000000", "103299784882390592625997020993947270" +
            "9539774634011737286921225057123429398759470312487176537538542446856328223686422660735041536000000000" +
            "0000000000000", "991677934870949689209571401541893801158183648651267795444376054838492222809091499987" +
            "689476037000748982075094738965754305639874560000000000000000000000", "9619275968248211985332842594956" +
            "3698712343813919172976158104477319333745612481875498805879175589072651261284189679678167647067832320" +
            "000000000000000000000", "9426890448883247745626185743057242473809693764078951663494238777294707070023" +
            "223798882976159207729119823605850588608460429412647567360000000000000000000000", "9332621544394415268" +
            "1699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758" +
            "2511852109168640000000000000000000000", "93326215443944152681699238856266700490715968264381621468592" +
            "963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"};

    public String getNum(int a) {
        return facTable[a];
    }

    public int getTotal_Entry() {
        return 101;
    }

    public int getStart_Num() {
        return 0;
    }

    public int getEnd_Num() {
        return 100;
    }


}
