"use strict";var KTBootstrapTimepicker={init:function(){$("#kt_timepicker_1, #kt_timepicker_1_modal").timepicker(),$("#kt_timepicker_2, #kt_timepicker_2_modal").timepicker({minuteStep:1,defaultTime:"",showSeconds:!0,showMeridian:!1,snapToStep:!0}),$("#kt_timepicker_3, #kt_timepicker_3_modal").timepicker({defaultTime:"11:45:20 AM",minuteStep:1,showSeconds:!0,showMeridian:!0}),$("#kt_timepicker_4, #kt_timepicker_4_modal").timepicker({defaultTime:"10:30:20 AM",minuteStep:1,showSeconds:!0,showMeridian:!0}),$("#kt_timepicker_1_validate, #kt_timepicker_2_validate, #kt_timepicker_3_validate").timepicker({minuteStep:1,showSeconds:!0,showMeridian:!1,snapToStep:!0})}};jQuery(document).ready(function(){KTBootstrapTimepicker.init()});