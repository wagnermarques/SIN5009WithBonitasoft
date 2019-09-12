/* French initialisation for the jQuery UI date picker plugin. */
/* Written by St�phane Nahmani (sholby@sholby.net). */
(function($) {
        $.ui.datepicker.regional['fr'] = {
                renderer: $.ui.datepicker.defaultRenderer,
                monthNames: ['Janvier','F�vrier','Mars','Avril','Mai','Juin',
                'Juillet','Ao�t','Septembre','Octobre','Novembre','D�cembre'],
                monthNamesShort: ['Jan','F�v','Mar','Avr','Mai','Jun',
                'Jul','Ao�','Sep','Oct','Nov','D�c'],
                dayNames: ['Dimanche','Lundi','Mardi','Mercredi','Jeudi','Vendredi','Samedi'],
                dayNamesShort: ['Dim','Lun','Mar','Mer','Jeu','Ven','Sam'],
                dayNamesMin: ['Di','Lu','Ma','Me','Je','Ve','Sa'],
                dateFormat: 'dd/mm/yyyy',
                firstDay: 1,
                prevText: '&#x3c;Pr�c', prevStatus: 'Voir le mois pr�c�dent',
                prevJumpText: '&#x3c;&#x3c;', prevJumpStatus: 'Voir l\'ann�e pr�c�dent',
                nextText: 'Suiv&#x3e;', nextStatus: 'Voir le mois suivant',
                nextJumpText: '&#x3e;&#x3e;', nextJumpStatus: 'Voir l\'ann�e suivant',
                currentText: 'Courant', currentStatus: 'Voir le mois courant',
                todayText: 'Aujourd\'hui', todayStatus: 'Voir aujourd\'hui',
                clearText: 'Effacer', clearStatus: 'Effacer la date s�lectionn�e',
                closeText: 'Fermer', closeStatus: 'Fermer sans modifier',
                yearStatus: 'Voir une autre ann�e', monthStatus: 'Voir un autre mois',
                weekText: 'Sm', weekStatus: 'Semaine de l\'ann�e',
                dayStatus: '\'Choisir\' le DD d MM',
                defaultStatus: 'Choisir la date',
                isRTL: false
        };
        $.extend($.ui.datepicker.defaults, $.ui.datepicker.regional['fr']);
})(jQuery);
