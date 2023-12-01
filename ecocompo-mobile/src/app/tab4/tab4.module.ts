import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IonicModule } from '@ionic/angular';
import { Tab4PageRoutingModule } from './tab4-routing.module';
import { Tab4Page } from './tab4.page';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';



@NgModule({
    declarations: [Tab4Page],
    imports: [
        CommonModule,
        IonicModule,
        Tab4PageRoutingModule,
        FormsModule,
        ReactiveFormsModule
    ]
})
export class Tab4PageModule {}
