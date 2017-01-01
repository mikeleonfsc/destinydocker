<%@ attribute type="com.follett.fsc.destiny.client.vopac.data.VopacSliderDataValue" name="sliderData" required="true" %>
<%@ attribute type="java.lang.String" name="id" required="true" %>
<%@ attribute type="java.lang.String" name="title" required="true" %>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<jsp:useBean id="VopacSpecs" class="com.follett.fsc.destiny.client.vopac.servlet.VopacSpecs"/>
<c:set var="trackID" value="${id}" />
<c:set var="lowHandleID" value="${id}${VopacSpecs.LIMITER_SLIDER_LOW_HANDLE}" />
<c:set var="highHandleID" value="${id}${VopacSpecs.LIMITER_SLIDER_HIGH_HANDLE}" />
<c:set var="sliderInfoID" value="${id}${VopacSpecs.LIMITER_SLIDER_INFO}" />
<c:set var="minValueID" value="${id}${VopacSpecs.LIMITER_SLIDER_MIN_VALUE}" />
<c:set var="maxValueID" value="${id}${VopacSpecs.LIMITER_SLIDER_MAX_VALUE}" />
<c:set var="lowSliderValueID" value="${id}${VopacSpecs.LIMITER_SLIDER_VALUE_LOW}" />
<c:set var="highSliderValueID" value="${id}${VopacSpecs.LIMITER_SLIDER_VALUE_HIGH}" />
<c:set var="sliderTitle" value="${id}${VopacSpecs.LIMITER_SLIDER_TITLE}" />
<c:set var="sliderBackground" value="${id}${VopacSpecs.LIMITER_SLIDER_BACKGROUND}" />

<c:choose>
<c:when test="${empty sliderData.singleValue}">
    <div>
        <div id="${minValueID}" class="minValue">${sliderData.limiterRange.minimum}</div>
        <div id="${maxValueID}" class="maxValue">${sliderData.limiterRange.maximum}</div>
        <div id="${sliderTitle}" class="sliderTitle">${title}</div>
    </div>
    <div id="${sliderBackground}" class="sliderBackground">
        <div id="${trackID}" class="sliderTrack ${VopacSpecs.CLASS_RESETTABLE_LIMITER}">
            <div id="${lowHandleID}" class="sliderHandle">
                <div id="${lowSliderValueID}" class="sliderValue leftSliderValue">${sliderData.limiterRange.minimum}</div>
            </div>
            <div id="${highHandleID}" class="sliderHandle">
                <div id="${highSliderValueID}" class="sliderValue rightSliderValue">${sliderData.limiterRange.maximum}</div>
            </div>
        </div>
    </div>
</c:when>
<c:otherwise>
    <div id="${sliderTitle}" class="sliderTitle">${title}</div>
    <div id="${trackID}" class="sliderSingleValue">${sliderData.singleValue}</div>
</c:otherwise>
</c:choose>

<script type="text/javascript">
    window.${id} = new LimiterSlider(["${lowHandleID}", "${highHandleID}"], "${trackID}", {
        id: "${id}",
        restricted: true,
        sliderValue: ["${sliderData.numericMinimum}","${sliderData.numericMaximum}"],
        range: $R(${sliderData.numericMinimum}, ${sliderData.numericMaximum}, false),
        myValues: ${sliderData.valuesJsArray},
        valueCounts: ${sliderData.valueCountsJsArray},
        translationArray: ${sliderData.translationJsArray},
        forceDecimal: ${sliderData.forceDecimal},
        rangedValueCounts: ${sliderData.rangedValueCounts}
    });
</script>