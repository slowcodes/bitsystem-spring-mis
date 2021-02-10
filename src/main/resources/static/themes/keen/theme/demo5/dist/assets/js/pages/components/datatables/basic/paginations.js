"use strict";
var KTDatatablesBasicPaginations = {
    init: function () {
        $("#kt_table_1").DataTable({
            responsive: !0,
            pagingType: "full_numbers",
            columnDefs: [
                // {
                //     targets: -1,
                //     title: "Actions",
                //     orderable: !1,
                //     render: function (a, t, e, s) {
                //         return '<span class="dropdown"><a href="#" class="btn btn-sm btn-clean btn-icon btn-icon-md" data-toggle="dropdown" aria-expanded="true">                              <i class="la la-ellipsis-h"></i>                            </a>                            <div class="dropdown-menu dropdown-menu-right">                                <a class="dropdown-item" href="#"><i class="la la-edit"></i> Book Services</a><a class="dropdown-item" href="#"><i class="la la-leaf"></i> Record Vitals</a><a class="dropdown-item" href="#"><i class="la la-print"></i> Generate Report</a></div></span><a href="#" class="btn btn-sm btn-clean btn-icon btn-icon-md" title="View">                          <i class="la la-edit"></i>                        </a>';
                //     },
                // },
                {
                    targets: 8,
                    render: function (a, t, e, s) {
                        var n = {
                            1: { title: "Pending", class: "kt-badge--brand" },
                            2: { title: "Delivered", class: " kt-badge--metal" },
                            3: { title: "Canceled", class: " kt-badge--primary" },
                            4: { title: "Success", class: " kt-badge--success" },
                            5: { title: "Info", class: " kt-badge--info" },
                            6: { title: "Danger", class: " kt-badge--danger" },
                            7: { title: "Warning", class: " kt-badge--warning" },
                        };
                        return void 0 === n[a] ? a : '<span class="kt-badge ' + n[a].class + ' kt-badge--inline kt-badge--pill">' + n[a].title + "</span>";
                    },
                },
                {
                    targets: 9,
                    render: function (a, t, e, s) {
                        var n = { Single: { title: "Single", state: "danger" }, Married: { title: "Married", state: "primary" }, Divorced: { title: "Divorced", state: "accent" } };
                        return void 0 === n[a] ? a : '<span class="kt-badge kt-badge--' + n[a].state + ' kt-badge--dot"></span>&nbsp;<span class="kt-font-bold kt-font-' + n[a].state + '">' + n[a].title + "</span>";
                    },
                },
            ],
        });
    },
};
jQuery(document).ready(function () {
    KTDatatablesBasicPaginations.init();
});
