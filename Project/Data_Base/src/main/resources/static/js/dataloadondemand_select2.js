var dataArray = {
    median: {
        index: 0,
        zIndex: 3,
        legendIndex: 0,
        color: '#e67a17',
        name: 'Median CPI',
        dataname: 'mediancpi',
        legendname: 'Median CPI',
        tooltipname: 'Median',
        csvname: 'Median CPI',
        chartTitle: 'Median Consumer Price Index',
        data: [[Date.UTC(2009, 0, 1), 2.63439354], [Date.UTC(2009, 1, 1), 2.57484136], [Date.UTC(2009, 2, 1), 2.48044172], [Date.UTC(2009, 3, 1), 2.44865979], [Date.UTC(2009, 4, 1), 2.35074344], [Date.UTC(2009, 5, 1), 2.07641175], [Date.UTC(2009, 6, 1), 1.75487968], [Date.UTC(2009, 7, 1), 1.64594989], [Date.UTC(2009, 8, 1), 1.45851560], [Date.UTC(2009, 9, 1), 1.37446785], [Date.UTC(2009, 10, 1), 1.25600864], [Date.UTC(2009, 11, 1), 1.26418766], [Date.UTC(2010, 0, 1), 1.12105078], [Date.UTC(2010, 1, 1), 0.93350974], [Date.UTC(2010, 2, 1), 0.75058361], [Date.UTC(2010, 3, 1), 0.63374151], [Date.UTC(2010, 4, 1), 0.54906846], [Date.UTC(2010, 5, 1), 0.59129267], [Date.UTC(2010, 6, 1), 0.63359693], [Date.UTC(2010, 7, 1), 0.53442504], [Date.UTC(2010, 8, 1), 0.58590987], [Date.UTC(2010, 9, 1), 0.58058408], [Date.UTC(2010, 10, 1), 0.64724041], [Date.UTC(2010, 11, 1), 0.72476947], [Date.UTC(2011, 0, 1), 0.85663434], [Date.UTC(2011, 1, 1), 1.09937750], [Date.UTC(2011, 2, 1), 1.26933580], [Date.UTC(2011, 3, 1), 1.41904667], [Date.UTC(2011, 4, 1), 1.58858042], [Date.UTC(2011, 5, 1), 1.64375631], [Date.UTC(2011, 6, 1), 1.80270463], [Date.UTC(2011, 7, 1), 2.03195356], [Date.UTC(2011, 8, 1), 2.11164123], [Date.UTC(2011, 9, 1), 2.18674570], [Date.UTC(2011, 10, 1), 2.23107699], [Date.UTC(2011, 11, 1), 2.31313520], [Date.UTC(2012, 0, 1), 2.38991946], [Date.UTC(2012, 1, 1), 2.29546558], [Date.UTC(2012, 2, 1), 2.35194124], [Date.UTC(2012, 3, 1), 2.35493665], [Date.UTC(2012, 4, 1), 2.30697834], [Date.UTC(2012, 5, 1), 2.30658814], [Date.UTC(2012, 6, 1), 2.26881977], [Date.UTC(2012, 7, 1), 2.20632180], [Date.UTC(2012, 8, 1), 2.18923937], [Date.UTC(2012, 9, 1), 2.17694303], [Date.UTC(2012, 10, 1), 2.19574656], [Date.UTC(2012, 11, 1), 2.14706382], [Date.UTC(2013, 0, 1), 2.10200940], [Date.UTC(2013, 1, 1), 2.15555208], [Date.UTC(2013, 2, 1), 2.05511336], [Date.UTC(2013, 3, 1), 2.05144666], [Date.UTC(2013, 4, 1), 2.07215687], [Date.UTC(2013, 5, 1), 2.10857861], [Date.UTC(2013, 6, 1), 2.09294022], [Date.UTC(2013, 7, 1), 2.05278758], [Date.UTC(2013, 8, 1), 2.04180793], [Date.UTC(2013, 9, 1), 1.98380942], [Date.UTC(2013, 10, 1), 2.02025331], [Date.UTC(2013, 11, 1), 2.09741904], [Date.UTC(2014, 0, 1), 2.06976967], [Date.UTC(2014, 1, 1), 2.07105358], [Date.UTC(2014, 2, 1), 2.21539155], [Date.UTC(2014, 3, 1), 2.21800944], [Date.UTC(2014, 4, 1), 2.28016518], [Date.UTC(2014, 5, 1), 2.23223785], [Date.UTC(2014, 6, 1), 2.29345446], [Date.UTC(2014, 7, 1), 2.26499929], [Date.UTC(2014, 8, 1), 2.28015701], [Date.UTC(2014, 9, 1), 2.37740915], [Date.UTC(2014, 10, 1), 2.32719019], [Date.UTC(2014, 11, 1), 2.28788933], [Date.UTC(2015, 0, 1), 2.25785668], [Date.UTC(2015, 1, 1), 2.31116830], [Date.UTC(2015, 2, 1), 2.28932818], [Date.UTC(2015, 3, 1), 2.35776392], [Date.UTC(2015, 4, 1), 2.31157269], [Date.UTC(2015, 5, 1), 2.42675754], [Date.UTC(2015, 6, 1), 2.37206646], [Date.UTC(2015, 7, 1), 2.35998116], [Date.UTC(2015, 8, 1), 2.41746188], [Date.UTC(2015, 9, 1), 2.42065774], [Date.UTC(2015, 10, 1), 2.45750606], [Date.UTC(2015, 11, 1), 2.41252102], [Date.UTC(2016, 0, 1), 2.44347739], [Date.UTC(2016, 1, 1), 2.38172071], [Date.UTC(2016, 2, 1), 2.37093712], [Date.UTC(2016, 3, 1), 2.39042040], [Date.UTC(2016, 4, 1), 2.46952870], [Date.UTC(2016, 5, 1), 2.38162373], [Date.UTC(2016, 6, 1), 2.44426063], [Date.UTC(2016, 7, 1), 2.53850946], [Date.UTC(2016, 8, 1), 2.45965311], [Date.UTC(2016, 9, 1), 2.44216667], [Date.UTC(2016, 10, 1), 2.45701055], [Date.UTC(2016, 11, 1), 2.46900644], [Date.UTC(2017, 0, 1), 2.56554243], [Date.UTC(2017, 1, 1), 2.58672787], [Date.UTC(2017, 2, 1), 2.53283194], [Date.UTC(2017, 3, 1), 2.38471582], [Date.UTC(2017, 4, 1), 2.30428000], [Date.UTC(2017, 5, 1), 2.21891443], [Date.UTC(2017, 6, 1), 2.17997922], [Date.UTC(2017, 7, 1), 2.18076357], [Date.UTC(2017, 8, 1), 2.22877218], [Date.UTC(2017, 9, 1), 2.30303435], [Date.UTC(2017, 10, 1), 2.28885109], [Date.UTC(2017, 11, 1), 2.38756890], [Date.UTC(2018, 0, 1), 2.44171565], [Date.UTC(2018, 1, 1), 2.38896662], [Date.UTC(2018, 2, 1), 2.48330343], [Date.UTC(2018, 3, 1), 2.59837226], [Date.UTC(2018, 4, 1), 2.65331564], [Date.UTC(2018, 5, 1), 2.80039526], [Date.UTC(2018, 6, 1), 2.83928043]]
    },
    trimmedmean: {
        index: 1,
        zIndex: 2,
        legendIndex: 1,
        color: '#2875a8',
        name: '16% Trimmed-Mean CPI',
        dataname: 'trimmedmeancpi',
        legendname: '16% Trimmed-Mean CPI',
        tooltipname: 'Trimmed',
        csvname: '16% Trimmed-Mean CPI',
        chartTitle: '16% Trimmed-Mean Consumer Price Index',
        data: [[Date.UTC(2009, 0, 1), 2.60432885], [Date.UTC(2009, 1, 1), 2.55232374], [Date.UTC(2009, 2, 1), 2.28330381], [Date.UTC(2009, 3, 1), 2.14336600], [Date.UTC(2009, 4, 1), 1.88608638], [Date.UTC(2009, 5, 1), 1.60418851], [Date.UTC(2009, 6, 1), 1.06335094], [Date.UTC(2009, 7, 1), 1.05709306], [Date.UTC(2009, 8, 1), 0.97420591], [Date.UTC(2009, 9, 1), 1.12827699], [Date.UTC(2009, 10, 1), 1.19772712], [Date.UTC(2009, 11, 1), 1.22676268], [Date.UTC(2010, 0, 1), 1.12721857], [Date.UTC(2010, 1, 1), 0.94985004], [Date.UTC(2010, 2, 1), 0.92936388], [Date.UTC(2010, 3, 1), 0.89618201], [Date.UTC(2010, 4, 1), 0.83800709], [Date.UTC(2010, 5, 1), 0.75884910], [Date.UTC(2010, 6, 1), 0.87130587], [Date.UTC(2010, 7, 1), 0.83201416], [Date.UTC(2010, 8, 1), 0.83231624], [Date.UTC(2010, 9, 1), 0.74916403], [Date.UTC(2010, 10, 1), 0.77895459], [Date.UTC(2010, 11, 1), 0.85197777], [Date.UTC(2011, 0, 1), 1.03493269], [Date.UTC(2011, 1, 1), 1.29517796], [Date.UTC(2011, 2, 1), 1.51193334], [Date.UTC(2011, 3, 1), 1.68376646], [Date.UTC(2011, 4, 1), 1.98193032], [Date.UTC(2011, 5, 1), 2.08659450], [Date.UTC(2011, 6, 1), 2.19364476], [Date.UTC(2011, 7, 1), 2.39500269], [Date.UTC(2011, 8, 1), 2.46800217], [Date.UTC(2011, 9, 1), 2.52209269], [Date.UTC(2011, 10, 1), 2.58031881], [Date.UTC(2011, 11, 1), 2.59826766], [Date.UTC(2012, 0, 1), 2.60415453], [Date.UTC(2012, 1, 1), 2.42809945], [Date.UTC(2012, 2, 1), 2.39365193], [Date.UTC(2012, 3, 1), 2.34165525], [Date.UTC(2012, 4, 1), 2.11126731], [Date.UTC(2012, 5, 1), 2.11295266], [Date.UTC(2012, 6, 1), 1.98585124], [Date.UTC(2012, 7, 1), 1.89806340], [Date.UTC(2012, 8, 1), 1.87425470], [Date.UTC(2012, 9, 1), 1.94245442], [Date.UTC(2012, 10, 1), 1.89174121], [Date.UTC(2012, 11, 1), 1.85122744], [Date.UTC(2013, 0, 1), 1.79590736], [Date.UTC(2013, 1, 1), 1.89353032], [Date.UTC(2013, 2, 1), 1.75769675], [Date.UTC(2013, 3, 1), 1.65805898], [Date.UTC(2013, 4, 1), 1.65435766], [Date.UTC(2013, 5, 1), 1.67249570], [Date.UTC(2013, 6, 1), 1.72294252], [Date.UTC(2013, 7, 1), 1.73656452], [Date.UTC(2013, 8, 1), 1.69900994], [Date.UTC(2013, 9, 1), 1.58652357], [Date.UTC(2013, 10, 1), 1.61408006], [Date.UTC(2013, 11, 1), 1.68673492], [Date.UTC(2014, 0, 1), 1.68930141], [Date.UTC(2014, 1, 1), 1.62204277], [Date.UTC(2014, 2, 1), 1.76823242], [Date.UTC(2014, 3, 1), 1.91515454], [Date.UTC(2014, 4, 1), 2.04116960], [Date.UTC(2014, 5, 1), 2.01313442], [Date.UTC(2014, 6, 1), 2.05792955], [Date.UTC(2014, 7, 1), 1.91110304], [Date.UTC(2014, 8, 1), 1.90172199], [Date.UTC(2014, 9, 1), 1.94515928], [Date.UTC(2014, 10, 1), 1.86165365], [Date.UTC(2014, 11, 1), 1.80187435], [Date.UTC(2015, 0, 1), 1.69554087], [Date.UTC(2015, 1, 1), 1.71219304], [Date.UTC(2015, 2, 1), 1.69711396], [Date.UTC(2015, 3, 1), 1.67405848], [Date.UTC(2015, 4, 1), 1.60707956], [Date.UTC(2015, 5, 1), 1.66245574], [Date.UTC(2015, 6, 1), 1.64215299], [Date.UTC(2015, 7, 1), 1.68942190], [Date.UTC(2015, 8, 1), 1.76355051], [Date.UTC(2015, 9, 1), 1.77917498], [Date.UTC(2015, 10, 1), 1.82511784], [Date.UTC(2015, 11, 1), 1.78467354], [Date.UTC(2016, 0, 1), 1.84783676], [Date.UTC(2016, 1, 1), 1.88542999], [Date.UTC(2016, 2, 1), 1.84637748], [Date.UTC(2016, 3, 1), 1.85988124], [Date.UTC(2016, 4, 1), 1.91376321], [Date.UTC(2016, 5, 1), 1.87339330], [Date.UTC(2016, 6, 1), 1.88017669], [Date.UTC(2016, 7, 1), 1.98208135], [Date.UTC(2016, 8, 1), 1.94898705], [Date.UTC(2016, 9, 1), 1.96761759], [Date.UTC(2016, 10, 1), 2.00782961], [Date.UTC(2016, 11, 1), 2.11578162], [Date.UTC(2017, 0, 1), 2.24210574], [Date.UTC(2017, 1, 1), 2.24182154], [Date.UTC(2017, 2, 1), 2.15444799], [Date.UTC(2017, 3, 1), 2.06720725], [Date.UTC(2017, 4, 1), 1.98976721], [Date.UTC(2017, 5, 1), 1.91600270], [Date.UTC(2017, 6, 1), 1.91376034], [Date.UTC(2017, 7, 1), 1.88221139], [Date.UTC(2017, 8, 1), 1.85153992], [Date.UTC(2017, 9, 1), 1.86703767], [Date.UTC(2017, 10, 1), 1.87908474], [Date.UTC(2017, 11, 1), 1.91279093], [Date.UTC(2018, 0, 1), 1.90545903], [Date.UTC(2018, 1, 1), 1.83931311], [Date.UTC(2018, 2, 1), 1.91597821], [Date.UTC(2018, 3, 1), 1.96336334], [Date.UTC(2018, 4, 1), 2.02822153], [Date.UTC(2018, 5, 1), 2.17108856], [Date.UTC(2018, 6, 1), 2.20081805]]
    },
    headline: {
        index: 2,
        zIndex: 1,
        legendIndex: 2,
        color: '#599871',
        name: 'CPI',
        dataname: 'cpi',
        legendname: 'CPI',
        tooltipname: 'CPI',
        csvname: 'Headline CPI',
        chartTitle: 'Headline Consumer Price Index',
        data: [[Date.UTC(2009, 0, 1), 0.02984650], [Date.UTC(2009, 1, 1), 0.23619109], [Date.UTC(2009, 2, 1), -0.38355625], [Date.UTC(2009, 3, 1), -0.73688572], [Date.UTC(2009, 4, 1), -1.28143580], [Date.UTC(2009, 5, 1), -1.42677604], [Date.UTC(2009, 6, 1), -2.09716135], [Date.UTC(2009, 7, 1), -1.48434861], [Date.UTC(2009, 8, 1), -1.28620597], [Date.UTC(2009, 9, 1), -0.18284828], [Date.UTC(2009, 10, 1), 1.83829587], [Date.UTC(2009, 11, 1), 2.72133113], [Date.UTC(2010, 0, 1), 2.62570864], [Date.UTC(2010, 1, 1), 2.14333178], [Date.UTC(2010, 2, 1), 2.31395945], [Date.UTC(2010, 3, 1), 2.23644720], [Date.UTC(2010, 4, 1), 2.02098608], [Date.UTC(2010, 5, 1), 1.05334897], [Date.UTC(2010, 6, 1), 1.23519278], [Date.UTC(2010, 7, 1), 1.14810456], [Date.UTC(2010, 8, 1), 1.14368266], [Date.UTC(2010, 9, 1), 1.17218761], [Date.UTC(2010, 10, 1), 1.14316091], [Date.UTC(2010, 11, 1), 1.49572353], [Date.UTC(2011, 0, 1), 1.63184686], [Date.UTC(2011, 1, 1), 2.10758463], [Date.UTC(2011, 2, 1), 2.68160326], [Date.UTC(2011, 3, 1), 3.16363086], [Date.UTC(2011, 4, 1), 3.56864578], [Date.UTC(2011, 5, 1), 3.55882825], [Date.UTC(2011, 6, 1), 3.62871598], [Date.UTC(2011, 7, 1), 3.77120818], [Date.UTC(2011, 8, 1), 3.86835684], [Date.UTC(2011, 9, 1), 3.52519992], [Date.UTC(2011, 10, 1), 3.39437759], [Date.UTC(2011, 11, 1), 2.96241884], [Date.UTC(2012, 0, 1), 2.92521671], [Date.UTC(2012, 1, 1), 2.87109878], [Date.UTC(2012, 2, 1), 2.65139819], [Date.UTC(2012, 3, 1), 2.30273981], [Date.UTC(2012, 4, 1), 1.70425377], [Date.UTC(2012, 5, 1), 1.66399376], [Date.UTC(2012, 6, 1), 1.40845070], [Date.UTC(2012, 7, 1), 1.69237900], [Date.UTC(2012, 8, 1), 1.99128208], [Date.UTC(2012, 9, 1), 2.16234360], [Date.UTC(2012, 10, 1), 1.76413385], [Date.UTC(2012, 11, 1), 1.74102237], [Date.UTC(2013, 0, 1), 1.59486467], [Date.UTC(2013, 1, 1), 1.97792351], [Date.UTC(2013, 2, 1), 1.47389621], [Date.UTC(2013, 3, 1), 1.06308538], [Date.UTC(2013, 4, 1), 1.36196506], [Date.UTC(2013, 5, 1), 1.75441655], [Date.UTC(2013, 6, 1), 1.96068161], [Date.UTC(2013, 7, 1), 1.51836756], [Date.UTC(2013, 8, 1), 1.18492526], [Date.UTC(2013, 9, 1), 0.96361270], [Date.UTC(2013, 10, 1), 1.23707220], [Date.UTC(2013, 11, 1), 1.50173562], [Date.UTC(2014, 0, 1), 1.57894737], [Date.UTC(2014, 1, 1), 1.12634925], [Date.UTC(2014, 2, 1), 1.51220288], [Date.UTC(2014, 3, 1), 1.95285790], [Date.UTC(2014, 4, 1), 2.12711155], [Date.UTC(2014, 5, 1), 2.07234137], [Date.UTC(2014, 6, 1), 1.99232864], [Date.UTC(2014, 7, 1), 1.69961133], [Date.UTC(2014, 8, 1), 1.65791868], [Date.UTC(2014, 9, 1), 1.66434022], [Date.UTC(2014, 10, 1), 1.32235518], [Date.UTC(2014, 11, 1), 0.75649327], [Date.UTC(2015, 0, 1), -0.08934831], [Date.UTC(2015, 1, 1), -0.02512980], [Date.UTC(2015, 2, 1), -0.07363739], [Date.UTC(2015, 3, 1), -0.19951745], [Date.UTC(2015, 4, 1), -0.03993274], [Date.UTC(2015, 5, 1), 0.12377120], [Date.UTC(2015, 6, 1), 0.16956978], [Date.UTC(2015, 7, 1), 0.19507929], [Date.UTC(2015, 8, 1), -0.03612975], [Date.UTC(2015, 9, 1), 0.17057444], [Date.UTC(2015, 10, 1), 0.50179758], [Date.UTC(2015, 11, 1), 0.72951979], [Date.UTC(2016, 0, 1), 1.37308681], [Date.UTC(2016, 1, 1), 1.01779978], [Date.UTC(2016, 2, 1), 0.85253622], [Date.UTC(2016, 3, 1), 1.12511042], [Date.UTC(2016, 4, 1), 1.01932255], [Date.UTC(2016, 5, 1), 0.99732649], [Date.UTC(2016, 6, 1), 0.82713887], [Date.UTC(2016, 7, 1), 1.06287450], [Date.UTC(2016, 8, 1), 1.46378365], [Date.UTC(2016, 9, 1), 1.63598752], [Date.UTC(2016, 10, 1), 1.69253716], [Date.UTC(2016, 11, 1), 2.07462213], [Date.UTC(2017, 0, 1), 2.50004221], [Date.UTC(2017, 1, 1), 2.73795817], [Date.UTC(2017, 2, 1), 2.38061243], [Date.UTC(2017, 3, 1), 2.19968988], [Date.UTC(2017, 4, 1), 1.87487772], [Date.UTC(2017, 5, 1), 1.63348796], [Date.UTC(2017, 6, 1), 1.72797846], [Date.UTC(2017, 7, 1), 1.93897421], [Date.UTC(2017, 8, 1), 2.23296387], [Date.UTC(2017, 9, 1), 2.04112870], [Date.UTC(2017, 10, 1), 2.20258294], [Date.UTC(2017, 11, 1), 2.10908247], [Date.UTC(2018, 0, 1), 2.07050762], [Date.UTC(2018, 1, 1), 2.21179542], [Date.UTC(2018, 2, 1), 2.35971140], [Date.UTC(2018, 3, 1), 2.46274394], [Date.UTC(2018, 4, 1), 2.80101171], [Date.UTC(2018, 5, 1), 2.87154784], [Date.UTC(2018, 6, 1), 2.94951509]]
    }
};
$(document).ready(function() {
    $.ajaxSetup({
        cache: false
    });
    // $('#dataselect').select2();
// {"results":[{"id":0,"text":"Median CPI","selected":true},{"id":1,"text":"16% Trimmed-Mean CPI"},{"id":2,"text":"Headline CPI"}]}

    // Populate the series selection dropdown dynamically from items in data array
    // var seriesnames = Object.entries(dataArray).map(([index, options]) => {
    //     return options.csvname;
    // });
    // console.log('seriesnames', seriesnames);

    // var results = seriesnames.map((name, index) => {
    //     if (index==0) {
    //         return { 'id': index, 'text': name, 'selected': true};
    //     } else {
    //         return { 'id': index, 'text': name };
    //     }
    // });
    // console.log('results', results);

    // var dataselect_options = { 'results': [...results] };
    // console.log(dataselect_options);
    // console.log(JSON.stringify(dataselect_options));
    // var blahdata = [{"id":"median","text":"Median CPI","selected":true},{"id":"trimmedmean","text":"16% Trimmed-Mean CPI"},{"id":"headline","text":"Headline CPI"}];
    // $("#dataselect").select2({
    //     data: blahdata
    // })
    var selectdata = Object.entries(dataArray).map(([name, options]) => {
        if (options.index == 0) {
            return { id: name, text: options.csvname, selected: true};
        } else {
            return { id: name, text: options.csvname};
        }
    });
    $("#dataselect").select2({
        data: selectdata
    })
    // $('#dataselect').trigger('change');
    // console.log('dataselecthtml',$("#dataselect").html());
    //$('#mySelect2').val('1'); // Select the option with a value of '1'
    //$('#mySelect2').trigger('change'); // Notify any JS components that the value changed


    var chartData = {
        chart: {
            zoomType: 'x',
            type: 'line',
            ganame: 'mediancpi_hp',
            animation: false,
            width: null,
            height: null,
            reflow: true,
            spacingBottom: 25,
            marginRight: 15,
            style: {
                fontFamily: 'Roboto, Arial, sans-serif',
                fontStyle: 'normal',
                fontWeight: 400
            },
            events: {
                load: function() {
                    $(".highcharts-legend-item path").attr('stroke-width', 3);
                },
                redraw: function() {
                    $(".highcharts-legend-item path").attr('stroke-width', 3);
                },
                beforePrint: function() {
                    this.exportSVGElements[0].box.hide();
                    this.exportSVGElements[1].hide();
                },
                afterPrint: function() {
                    this.exportSVGElements[0].box.show();
                    this.exportSVGElements[1].show();
                },
                render: function() {
                    // Add zoom note to chart when user hovers over plot area
                    var chart = this;
                    var zoomlabeltemp = chart.renderer.text('Click/drag to zoom', 0, 0).add();
                    var width = zoomlabeltemp.getBBox().width;
                    var height = zoomlabeltemp.getBBox().height;
                    zoomlabeltemp.destroy();
                    var zoomlabel = chart.renderer.label('Click/drag to zoom', chart.plotLeft + chart.plotWidth - width - 10, chart.plotTop + 5)
                        .attr({
                            id: 'zoomtooltip'
                        })
                        .css({
                            color: '#414b56',
                            'opacity': 0
                        })
                        .add();
                },
                selection: function(event) {
                    var chart = this;
                    if ($("#zoomtooltip").length) {
                        $("#zoomtooltip").stop().animate({ opacity: 0 }, 500);
                    }
                }
            }
        },
        accessibility: {
            enabled: false
        },
        title: {
            text: 'Median Consumer Price Index',
            align: 'left',
            margin: 5,
            style: {
                fontSize: '14px',
                fontWeight: 500,
                color: 'rgba(85,85,85,1)'
            }
        },
        credits: {
            text: "Source: Bureau of Labor Statistics, FRB Cleveland, Haver Analytics",
            href: false,
            useHTML: true,
            position: {
                align: 'left',
                x: 10,
                y: -5
            },
            style: {
                color: 'rgba(102,102,102,1)',
                fontSize: '9px',
                cursor: 'default'
            }
        },
        tooltip: {
            shared: true,
            useHTML: true,
            backgroundColor: 'rgba(255,255,255,1)',
            borderColor: 'rgba(65,75,76,1)',
            formatter: function() {
                var s = '<span style="font-size: 12px !important; font-weight: normal !important;">' + Highcharts.dateFormat("%B %Y", new Date(this.x)) + '</span><br/>';
                s += '<table>';
                $.each(this.points, function() {
                    s += '<tr><td style="color:';
                    s += this.series.color + ' !important;';
                    s += ' text-align: left !important;';
                    s += ' padding: 0px 10px 0px 0px !important;';
                    s += ' font-size: 12px !important;';
                    s += ' font-weight: bold !important;';
                    s += '">';
                    s += this.series.options.tooltipname;
                    s += ':</td>';
                    s += '<td style="text-align: right !important; font-size: 12px !important; font-weight: bold !important;">';
                    s += '   ';
                    if (this.series.options.tooltipvalueprefix) {
                        s += this.series.options.tooltipvalueprefix;
                    }
                    s += Highcharts.numberFormat(this.y, 1, '.', ',');
                    if (this.series.options.tooltipvaluesuffix) {
                        s += this.series.options.tooltipvaluesuffix;
                    }
                    s += '</td></tr>';
                });
                s += '</table>';
                return s;
            }
        },
        legend: {
            verticalAlign: 'top',
            align: 'left',
            margin: 10,
            x: 0,
            y: -5,
            itemStyle: {
                color: 'rgba(102,102,102,1)',
                fontSize: '10px',
                fontWeight: 'normal',
                cursor: 'default'
            },
            labelFormatter: function() {
                return this.options.legendname;
            }
        },
        plotOptions: {
            series: {
                pointStart: Date.UTC(2009, 0, 1),
                pointIntervalUnit: 'month',
                lineWidth: 3,
                states: {
                    hover: {
                        lineWidthPlus: 0,
                        halo: {
                            size: 0
                        }
                    }
                },
                marker: {
                    enabled: false,
                    symbol: 'circle',
                    radius: 2,
                    states: {
                        hover: {
                            radiusPlus: 2,
                            lineWidthPlus: 1,
                            enabled: true
                        }
                    }
                },
                // stickyTracking: false,
                events: {
                    legendItemClick: function() {
                        return false;
                        // <== returning false disables legend click action
                    },
                    mouseOver: function(e) {
                        // $("#chart_container").removeClass("cursorDefault").addClass("cursorZoom");
                        if (!$(".highcharts-reset-zoom").length) {
                            $("#zoomtooltip").stop().animate({ opacity: 0.9 }, 200);
                        }
                    },
                    mouseOut: function(e) {
                        // $("#chart_container").removeClass("cursorZoom").addClass("cursorDefault");
                        $("#zoomtooltip").stop().animate({ opacity: 0 }, 300);
                    }
                },
                showInLegend: true
                // hide: function () { ga('send', 'event', 'Highcharts', 'hideSeries', this.options.chart.gaTitle + ' (series: ' + this.name + ') | ' + document.title); },
                // show: function () { ga('send', 'event', 'Highcharts', 'showSeries', this.options.chart.gaTitle + ' (series: ' + this.name + ') | ' + document.title); }
            }
        },
        yAxis: {
            title: {
                text: 'Year-over-year percent change',
                style: {
                    fontSize: '11px',
                    fontWeight: 'normal',
                    whiteSpace: 'nowrap',
                    color: 'rgba(102,102,102,1)'
                }
            },
            labels: {
                format: '{value}',
                style: {
                    fontSize: '10px',
                    color: 'rgba(102,102,102,1)'
                }
            },
            lineColor: 'rgba(145,145,145,0)',
            lineWidth: 0,
            gridLineColor: 'rgba(225,225,225,1)',
            gridLineWidth: 1,
            minorGridLineColor: 'rgba(225,225,225,0)',
            tickColor: 'rgba(207,216,220,1)',
            tickWidth: 0,
            tickLength: 0,
            minPadding: 0,
            maxPadding: 0,
            plotLines: [{
                value: 0,
                color: 'rgba(145,145,145,1)',
                width: 2
            }]
        },
        xAxis: {
            type: 'datetime',
            title: {
                text: null
            },
            labels: {
                rotation: 0,
                style: {
                    fontSize: '10px',
                    color: 'rgba(102,102,102,1)'
                }
            },
            lineColor: 'rgba(145,145,145,1)',
            lineWidth: 1,
            gridLineColor: 'rgba(225,225,225,0)',
            gridLineWidth: 0,
            minorGridLineColor: 'rgba(225,225,225,0)',
            tickColor: 'rgba(145,145,145,1)',
            tickWidth: 1,
            tickPosition: 'inside',
            tickLength: 5,
            minPadding: 0,
            allowDecimals: true,
            crosshair: true,
            dateTimeLabelFormats: {
                month: '%b-%Y',
                year: '%Y'
            },
            // min: Date.UTC(2009,0,1),
            // max: Date.UTC(2018,6,1),
            // tickPositions: [Date.UTC(2009,0,1),Date.UTC(2010,0,1),Date.UTC(2011,0,1),Date.UTC(2012,0,1),Date.UTC(2013,0,1),Date.UTC(2014,0,1),Date.UTC(2015,0,1),Date.UTC(2016,0,1),Date.UTC(2017,0,1),Date.UTC(2018,0,1)],
            plotBands: [{
                from: Date.UTC(2007, 11, 1),
                to: Date.UTC(2009, 5, 1),
                color: 'rgba(231,231,231,1)',
                id: 1
            }]
        },
        navigation: {
            menuItemStyle: {
                fontWeight: 'normal',
                background: 'none',
                color: 'rgba(51,51,51,1)'
            },
            menuItemHoverStyle: {
                fontWeight: 'bold',
                background: 'none',
                color: 'rgba(51,51,51,1)'
            }
        },
        exporting: {
            filename: 'cleveland_fed_mediancpi',
            scale: 2,
            chartOptions: {
                chart: {
                    events: null
                },
                plotOptions: {
                    series: {
                        lineWidth: 3
                    }
                }
            },
            sourceWidth: 950,
            sourceHeight: 540,
            buttons: {
                contextButton: {
                    align: 'right',
                    enabled: true,
                    height: 20,
                    symbol: 'menu',
                    symbolFill: 'rgba(65,75,86,1)',
                    symbolSize: 14,
                    symbolStroke: 'rgba(65,75,86,1)',
                    symbolStrokeWidth: 2,
                    symbolX: 12.5,
                    symbolY: 10.5,
                    text: null,
                    verticalAlign: 'top',
                    width: 24,
                    x: -10,
                    y: 0,
                    menuItems: [{
                        text: 'Latest News Release',
                        onclick: function() {
                            window.open('https://clevelandfed.org/our-research/indicators-and-data/median-cpi.aspx', '_blank');
                        }
                    }, {
                        separator: true
                    }, {
                        // text: "Download XLSX",
                        text: '<div style="font-size:14px;"><i class="fas fa-fw fa-file-excel" style="padding-right:5px; color: #217344;"></i>Excel</div>',
                        onclick: function() {
                            this.downloadXLSX();
                            // ga('send', 'event', 'Highcharts', 'downloadXLSX', '(chart: ' + this.options.chart.gaTitle + ') | ' + document.title);
                        }
                    }, {
                        // textKey: "downloadCSV",
                        text: '<div style="font-size:14px;"><i class="fas fa-fw fa-file-alt" style="padding-right:5px; color:#424C57;"></i>CSV</div>',
                        onclick: function() {
                            this.downloadCSV();
                            // ga('send', 'event', 'Highcharts', 'downloadCSV', '(chart: ' + this.options.chart.ganame + ') | ' + document.title);
                        }
                    }, {
                        // textKey: 'downloadPNG',
                        text: '<div style="font-size:14px;"><i class="far fa-fw fa-image" style="padding-right:5px; color:#103c62;"></i>PNG Image</div>',
                        onclick: function() {
                            // ga('send', 'event', 'Highcharts', 'downloadPNG', '(chart: ' + this.options.chart.ganame + ') | ' + document.title);
                            this.exportChart({
                                type: 'image/png'
                            });
                        }
                    }, {
                        // textKey: 'downloadPDF',
                        text: '<div style="font-size:14px;"><i class="far fa-fw fa-file-pdf" style="padding-right:5px; color:#FF0000"></i>PDF Document</div>',
                        onclick: function() {
                            this.exportChart({
                                type: 'application/pdf'
                            });
                            // ga('send', 'event', 'Highcharts', 'downloadPDF', '(chart: ' + this.options.chart.ganame + ') | ' + document.title);
                        }
                    }]
                }
            },
            csv: {
                dateFormat: '%Y-%m-%d',
                columnHeaderFormatter: function(item) { /* Column is axis object */
                    if (item instanceof Highcharts.Axis) { /* Datetime axis */
                        if (item.isDatetimeAxis) { /* Use title if it exists */
                            if (item.options.title.text) {
                                return item.options.title.text;
                            } /* Else use title 'Date' (HC default = 'DateTime') */
                            else {
                                return 'Date';
                            }
                        } /* Category axis (only other type) */
                        else { /* Use title if it exists */
                            if (item.options.title.text) {
                                return item.options.title.text;
                            } /* Use HC default title if it doesn't */
                            else {
                                return 'Category';
                            }
                        }
                    }
                        // This lets chart owner specify the column header the particular
                        // series will have in the exported file. The default is to use
                    // the series name.
                    else if (item instanceof Highcharts.Series) {
                        if (item.options.csvname) {
                            return item.options.csvname;
                        } else {
                            return item.name;
                        }
                    }
                }
            },
            xlsx: {
                tsfrequency: 'monthly',
                worksheet: {
                    name: 'Median CPI'
                },
                workbook: {
                    fileProperties: {
                        author: "Federal Reserve Bank of Cleveland",
                        company: "Federal Reserve Bank of Cleveland",
                        created_date: new Date(Date.now())
                    }
                }
            }
        }
    };
    var seriesID = $("#dataselect option:selected").val();
    console.log(seriesID,'seriesID');
    var newSeries = { series: [dataArray[seriesID]] };
    console.log('newSeries', newSeries);
    console.log('isObject', Highcharts.isObject(newSeries));
    console.log('title', newSeries.series[0].chartTitle);
    var chart = new Highcharts.Chart('chart_container', Highcharts.merge(chartData, newSeries));
    chart.setTitle({ text: newSeries.series[0].chartTitle},true);
    // $('.selectpicker').selectpicker('val', 'Mustard');
    // $('#dataselect').on('change', function () {
    //     console.log('dis',$(this).prop('disabled'));
    //     console.log('val',$(this).prop('value'));
    // });
    $('#dataselect').on('change', function() {
        var dataID = $("#dataselect option:selected").val();
        // var dataID = $(this).prop('value');
        console.log('dataID', dataID);
        var chart = $('#chart_container').highcharts();
        var newSeries = dataArray[dataID];
        chart.setTitle({ text: newSeries.chartTitle },true);
        chart.series[0].update({
            index: newSeries.index,
            zIndex: newSeries.zIndex,
            legendIndex: newSeries.legendIndex,
            color: newSeries.color,
            name: newSeries.name,
            dataname: newSeries.dataname,
            legendname: newSeries.legendname,
            tooltipname: newSeries.tooltipname,
            csvname: newSeries.csvname,
            data: newSeries.data
        });

    }); //.change();
    var devbordersenabled = false;
    $('#enabledevborders').click(function(){
        $("#select_group, #download-btns, #chart_container").toggleClass("dev");
        // if (devbordersenabled==false) {
        // $("#select_group").css({"border": "dashed 2px green"});
        // $("#download-btns").css({"border": "dashed 2px green"});
        // $("#chomepage").css({"border": "dashed 2px green"});
        // devbordersenabled=true;
        // } else {
        // $("#select_group").css({"border": "dashed 2px green"});
        // $("#download-btns").css({"border": "dashed 2px green"});
        // $("#chomepage").css({"border": "dashed 2px green"});
        // devbordersenabled=true;
        // }
    });
    // $("#enabledevborders").click(function(){
    //     $("h1, h2, p").toggleClass("blue");
    // });

});

// var selectdata = Object.entries(dataArray).map(([name, options]) => {
//     if (options.index == 0) {
//         return { id: name, text: options.csvname, selected: true};
//     } else {
//         return { id: name, text: options.csvname};
//     }
// });
// $("#dataselect").select2({
//     data: selectdata
// })
// $('#dataselect').trigger('change');
// console.log('dataselecthtml',$("#dataselect").html());
//var seriesKeys = ['index', 'zIndex', 'legendIndex', 'color', 'name', 'dataname', 'legendname', 'tooltipname', 'csvname', 'data']
//var checkid = 'trimmedmean';

//var newSeries = dataArray[checkid];
//var newData = newSeries.data;
//var newOptions = getSeriesOptions(newSeries);

//console.log('newdata',newData);
//console.log('newoptions',newOptions);


// var seriesids = Object.keys(dataArray);
// console.log('data',data);
// seriesids.forEach( seriesid => console.log(dataArray[seriesid].legendname));

// seriesnames.forEach(function(value, option) {
//   const index = name.index;
// });
// var median = dataArray['median'];
// console.log('median',median);
//Object.entries(dataArray).forEach(([key, value]) => console.log(`${key}: ${value}`));

//const map = new Map(Object.entries(dataArray));
//console.log('map',map.get(median));
// map.forEach(function(value, key) {
//   if (Highcharts.isObject(value)) {
//     Object.entries(value).forEach(function(value, key) {
//       console.log(key + ' = ' + value);
//     });
//   } else {
//     console.log(key + ' = ' + value, 'not an object');
//   }
// });

// const data = Object.entries(dataArray);
// const mediandata = Object.entries(dataArray.median);
// $('#data').text(data);
// //$('#data').text(data);
// console.log(mediandata);

// const keyify = (obj, prefix = '') =>
//   Object.keys(obj).reduce((res, el) => {
//     if( Array.isArray(obj[el]) ) {
//       return res;
//     } else if( typeof obj[el] === 'object' && obj[el] !== null ) {
//       return [...res, ...keyify(obj[el], prefix + el + '.')];
//     } else {
//       return [...res, prefix + el];
//     }
//   }, []);

// const output = keyify(dataArray);

// console.log(output);

// var person = {
//     firstName: "John",
//     lastName : "Doe",
//     id       : 5566,
//     fullName : function() {
//         return this.firstName + " " + this.lastName;
//     }
// };