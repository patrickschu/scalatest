define("bundles/enroll/components/subscriptions/subscription-course-upsell/SubscriptionInCourseUpsellBanner",["require","exports","module","react","underscore","naptime","bundles/naptimejs/resources/onDemandCourseMaterialPassableLessonElements.v1","bundles/naptimejs/resources/onDemandCourseMaterialItems.v2","bundles/naptimejs/resources/onDemandCoursesProgress.v1","bundles/naptimejs/resources/onDemandCourseMaterialLessons.v1","bundles/naptimejs/resources/onDemandCourseMaterialModules.v1","bundles/naptimejs/resources/onDemandCourseMaterials.v2","bundles/naptimejs/resources/subscriptionTrials.v1","bundles/coursera-ui/components/extended/Notification","bundles/payments/common/ProductType","bundles/page/components/TrackedButton","bundles/enroll/components/subscriptions/catalogSubscription/SubscriptionCertificatePaywallUpsellModal","js/lib/coursera.react-intl","js/lib/stringKeyTuple","js/lib/user","js/lib/withEpic","i18n!nls/payments","css!./__styles__/SubscriptionInCourseUpsellBanner"],function(require,exports,module){"use strict";function _defaults(e,t){for(var o=Object.getOwnPropertyNames(t),s=0;s<o.length;s++){var n=o[s],r=Object.getOwnPropertyDescriptor(t,n);r&&r.configurable&&void 0===e[n]&&Object.defineProperty(e,n,r)}return e}function _classCallCheck(e,s){if(!(e instanceof s))throw new TypeError("Cannot call a class as a function")}function _possibleConstructorReturn(s,e){if(!s)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!e||"object"!=typeof e&&"function"!=typeof e?s:e}function _inherits(s,e){if("function"!=typeof e&&null!==e)throw new TypeError("Super expression must either be null or a function, not "+typeof e);s.prototype=Object.create(e&&e.prototype,{constructor:{value:s,enumerable:!1,writable:!0,configurable:!0}}),e&&(Object.setPrototypeOf?Object.setPrototypeOf(s,e):_defaults(s,e))}var e=require("react"),_=require("underscore"),s=require("naptime"),y=require("bundles/naptimejs/resources/onDemandCourseMaterialPassableLessonElements.v1"),I=require("bundles/naptimejs/resources/onDemandCourseMaterialItems.v2"),D=require("bundles/naptimejs/resources/onDemandCoursesProgress.v1"),l=require("bundles/naptimejs/resources/onDemandCourseMaterialLessons.v1"),u=require("bundles/naptimejs/resources/onDemandCourseMaterialModules.v1"),c=require("bundles/naptimejs/resources/onDemandCourseMaterials.v2"),d=require("bundles/naptimejs/resources/subscriptionTrials.v1"),m=require("bundles/coursera-ui/components/extended/Notification"),p=require("bundles/payments/common/ProductType"),b=p.VERIFIED_CERTIFICATE,a=require("bundles/page/components/TrackedButton"),f=require("bundles/enroll/components/subscriptions/catalogSubscription/SubscriptionCertificatePaywallUpsellModal"),g=require("js/lib/coursera.react-intl"),h=g.FormattedMessage,r=require("js/lib/stringKeyTuple"),t=r.tupleToStringKey,v=r.stringKeyToTuple,n=require("js/lib/user"),C=require("js/lib/withEpic"),o=require("i18n!nls/payments");require("css!./__styles__/SubscriptionInCourseUpsellBanner");var j=function(s){function SubscriptionInCourseUpsellBanner(){var r,e,t;_classCallCheck(this,SubscriptionInCourseUpsellBanner);for(var o=arguments.length,i=Array(o),n=0;o>n;n++)i[n]=arguments[n];return r=e=_possibleConstructorReturn(this,s.call.apply(s,[this].concat(i))),e.state={didDismiss:!1,showEnrollModal:!1},e.handleDismiss=function(){e.setState(function(){return{didDismiss:!0}})},e.buttonClickHandler=function(){e.setState(function(e){var s=e.showEnrollModal;return{showEnrollModal:!s}})},t=r,_possibleConstructorReturn(e,t)}return _inherits(SubscriptionInCourseUpsellBanner,s),SubscriptionInCourseUpsellBanner.prototype.render=function render(){var n=this.props,l=n.subscriptionTrials,u=n.courseId,s=n.passableItems,t=n.courseProgress,r=this.state,c=r.didDismiss,d=r.showEnrollModal;if(!s||!t||0===s.length)return null;var p=s.filter(function(n){var e=v(n.id),r=e.length>=2?e[1]:null,s=t.items[r];return s&&"completed"===s.progressState.toLowerCase()}),b=p.length/s.length*100,i=!_(l).isEmpty();if(50>b||!i||c)return null;return e.createElement("div",{className:"rc-SubscriptionInCourseUpsellBanner"},e.createElement(m,{type:"info",style:{fontSize:"14px"},isDismissible:!0,onDismiss:this.handleDismiss,message:e.createElement(h,{message:o("You're doing great! Earn a certificate and share your accomplishments. {learn_more}"),learn_more:e.createElement(a,{className:"button-link",trackingName:"learn_more",onClick:this.buttonClickHandler},o("Learn more"))})}),d&&e.createElement(f,{courseId:u,handleClose:this.buttonClickHandler}))},SubscriptionInCourseUpsellBanner}(e.Component),E=s.createContainer(j,function(s){var n=s.grades,o=void 0===n?[]:n,r=s.items,t=void 0===r?[]:r,e=t.map(function(e){return"item~"+e.id});return e&&e.length>0?{passableItems:y.multiGet(e)}:{}}),i=s.createContainer(E,function(n){var s=n.lessons,r=void 0===s?[]:s,e=r.reduce(function(e,module){return e.concat(module.itemIds)},[]);return e&&e.length>0?{items:I.multiGet(e,{fields:["name","slug","contentSummary","isLocked"]})}:{}}),M=s.createContainer(i,function(n){var s=n.modules,r=void 0===s?[]:s,e=r.reduce(function(e,module){return e.concat(module.lessonIds)},[]);return e&&e.length>0?{lessons:l.multiGet(e,{fields:["elementIds"],subcomponents:[i]})}:{}}),T=s.createContainer(M,function(s){var e=s.courseMaterials;return e&&e.length>0?{modules:u.multiGet(e[0].moduleIds,{fields:["name","description","lessonIds"]})}:{}}),w=s.createContainer(T,function(e){var s=e.courseId,r=e.subscriptionTrials;return r&&r.length>0?{courseProgress:D.get(t([n.get().id,s]),{fields:["isCompleted","nextItem","items"]}),courseMaterials:c.finder("learner",{params:{learnerId:n.get().id,courseId:s},fields:["moduleIds"],includes:["modules","passableLessonElements"]})}:{}});module.exports=_.compose(C("Growth","blockTrialOnlyCertificates"),s.createContainer(function(e){var s=e.courseId;return{subscriptionTrials:d.finder("findActiveTrialsForUserAndProduct",{params:{userId:n.get().id,productId:t([b,s])},fields:["subscriptionId","productType","productItemId"]})}}))(w)});