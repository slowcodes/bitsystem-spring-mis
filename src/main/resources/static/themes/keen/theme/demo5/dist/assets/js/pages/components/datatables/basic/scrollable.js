"use strict";var KTDatatablesBasicScrollable={init:function(){$("#kt_table_1").DataTable({scrollY:"50vh",scrollX:!0,scrollCollapse:!0,columnDefs:[{targets:-1,title:"Actions",orderable:!1,render:function(a,t,e,s){return'                        <span class="dropdown">                            <a href="#" class="btn btn-sm btn-clean btn-icon btn-icon-md" data-toggle="dropdown" aria-expanded="true">                              <i class="la la-ellipsis-h"></i>                            </a>                            <div class="dropdown-menu dropdown-menu-right">                                <a class="dropdown-item" href="#"><i class="la la-edit"></i> Edit Details</a>                                <a class="dropdown-item" href="#"><i class="la la-leaf"></i> Update Status</a>                                <a class="dropdown-item" href="#"><i class="la la-print"></i> Generate Report</a>                            </div>                        </span>                        <a href="#" class="btn btn-sm btn-clean btn-icon btn-icon-md" title="View">                          <i class="la la-edit"></i>                        </a>'}},{targets:8,render:function(a,t,e,s){var l={1:{title:"Pending",class:"kt-badge--brand"},2:{title:"Delivered",class:" kt-badge--metal"},3:{title:"Canceled",class:" kt-badge--primary"},4:{title:"Success",class:" kt-badge--success"},5:{title:"Info",class:" kt-badge--info"},6:{title:"Danger",class:" kt-badge--danger"},7:{title:"Warning",class:" kt-badge--warning"}};return void 0===l[a]?a:'<span class="kt-badge '+l[a].class+' kt-badge--inline kt-badge--pill">'+l[a].title+"</span>"}},{targets:9,render:function(a,t,e,s){var l={1:{title:"Online",state:"danger"},2:{title:"Retail",state:"primary"},3:{title:"Direct",state:"accent"}};return void 0===l[a]?a:'<span class="kt-badge kt-badge--'+l[a].state+' kt-badge--dot"></span>&nbsp;<span class="kt-font-bold kt-font-'+l[a].state+'">'+l[a].title+"</span>"}}]}),$("#kt_table_2").DataTable({scrollY:"50vh",scrollX:!0,scrollCollapse:!0,createdRow:function(a,t,e){var s={1:{title:"Pending",class:"kt-badge--brand"},2:{title:"Delivered",class:" kt-badge--metal"},3:{title:"Canceled",class:" kt-badge--primary"},4:{title:"Success",class:" kt-badge--success"},5:{title:"Info",class:" kt-badge--info"},6:{title:"Danger",class:" kt-badge--danger"},7:{title:"Warning",class:" kt-badge--warning"}},l='<span class="kt-badge '+s[t[18]].class+' kt-badge--inline kt-badge--pill">'+s[t[18]].title+"</span>";a.getElementsByTagName("td")[18].innerHTML=l,l='<span class="kt-badge kt-badge--'+(s={1:{title:"Online",state:"danger"},2:{title:"Retail",state:"primary"},3:{title:"Direct",state:"accent"}})[t[19]].state+' kt-badge--dot"></span>&nbsp;<span class="kt-font-bold kt-font-'+s[t[19]].state+'">'+s[t[19]].title+"</span>",a.getElementsByTagName("td")[19].innerHTML=l},columnDefs:[{targets:-1,title:"Actions",orderable:!1,render:function(a,t,e,s){return'                        <span class="dropdown">                            <a href="#" class="btn btn-sm btn-clean btn-icon btn-icon-md" data-toggle="dropdown" aria-expanded="true">                              <i class="la la-ellipsis-h"></i>                            </a>                            <div class="dropdown-menu dropdown-menu-right">                                <a class="dropdown-item" href="#"><i class="la la-edit"></i> Edit Details</a>                                <a class="dropdown-item" href="#"><i class="la la-leaf"></i> Update Status</a>                                <a class="dropdown-item" href="#"><i class="la la-print"></i> Generate Report</a>                            </div>                        </span>                        <a href="#" class="btn btn-sm btn-clean btn-icon btn-icon-md" title="View">                          <i class="la la-edit"></i>                        </a>'}}]})}};jQuery(document).ready(function(){KTDatatablesBasicScrollable.init()});